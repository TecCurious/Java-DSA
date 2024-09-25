public class Part2BST {
    

     static class Node {
        int data;
        Node left;
        Node right;

        Node (int dada){
            this.data = dada;
            this.left = null;
            this.right = null;
        }
     }

        // Crating Balance BST
        public static Node createBST(int arr[] , int si , int ei){
            //base case{
            if(si>ei){
                return null;
            }

            int mid = (si+ei)/2;
            Node root = new Node(arr[mid]);
            root.left = createBST(arr, si, mid-1);
            root.right = createBST(arr, mid+1, ei);

            return root;
        }

        // Inorder traversal
        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);

        }

    public static void main(String[] args) {
        
        int arr[] = {3,5,6,8,10,11,12};
        
        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);


    }
}
