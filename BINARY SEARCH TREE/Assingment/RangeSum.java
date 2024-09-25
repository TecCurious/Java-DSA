public class RangeSum {

    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }
    }

    // find the sum in the range

    public static int rangeSum(Node root , int l , int r){

        // base case 
        if(root == null){
            return 0;
        }
            // condition 1
        if(root.data >= l && root.data <= r ){
            int left = rangeSum(root.left, l, r);
            int right = rangeSum(root.right, left, r);
            return left + right + root.data;
        }

        // condition 2
        if(root.data < l){
            return rangeSum(root.right, l, r);
        }
        else {
            return rangeSum(root.left, l, r);
        }


    }

    public static void main(String[] args) {
        /*
         8
        / \
        5 11
        / \ \
        3 6 20

         */

         Node root = new Node(8);
         root.left = new Node(5);
         root.left.left = new Node(3);
         root.left.right = new Node(6);
         root.right = new Node(11);
         root.right.right = new Node(20);

        System.out.println(rangeSum(root, 10, 11));

    }
}