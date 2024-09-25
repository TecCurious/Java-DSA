public class BSTmaxSumInBT {
    static class Node {
        int data;
        Node left; 
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info (boolean isBST , int sum , int min , int max ){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
        public static Info maxSumBSTinBT(Node root){
            if(root == null){
                return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }

            Info left = maxSumBSTinBT(root.left);
            Info right = maxSumBSTinBT(root.right);

            int min = Math.min(root.data  ,  Math.min(left.min, right.min));
            int max = Math.max( root.data, Math.max(left.max, left.max));

            if(left.max >= root.data || root.data >= right.min){
                return new Info(false, Math.max(left.sum, right.sum), min, max);
            }

            if(right.isBST && left.isBST){
                return new Info(true, left.sum+right.sum+root.data, min, max);
            }

            return new Info(false, Math.max(left.sum, right.sum), min, max);
        }
    

     public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info ans = maxSumBSTinBT(root);
        System.out.println(ans.sum);
     }
}
