public class SubTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static boolean isIdentical(Node node , Node subRoot){

            if(node == null && subRoot == null){
                return true;
            } else if(node == null || subRoot == null || node.data != subRoot.data ){
                return false;
            }

            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }

            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }

            return true;
      }

    // chek subtree is present in the tree or not
    public static boolean isSubTree(Node root , Node subRoot){

        // base case
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root , subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        /*
               
              1
           /    \
          2      3
         / \    / \
        4   5  6   7

        */

        Node root = new Node(1);
        root.left =  new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
             2
            / \
           4   5

         */

         Node subRoot = new Node(2);
         subRoot.left = new Node(4);
        //  subRoot.right = new Node(5);


         System.out.println(isSubTree(root, subRoot));
    }
}
