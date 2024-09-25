import java.util.ArrayList;

public class BSTtoB_bst {

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

    // inorder traversa for adding bst values in arraylist
        public static void getInorder(Node root, ArrayList<Integer> list){
            if(root == null){
                return;
            }

            getInorder(root.left, list);
            list.add(root.data);
            getInorder(root.right, list);

        }


        // create Balance BSt
        public static Node createBST(ArrayList<Integer> list , int si, int ei){

            if(si>ei){
                return null;
            }

            int mid = (si+ei)/2;
            Node root = new Node(list.get(mid));
           root.left =  createBST(list, si, mid-1);
           root.right =  createBST(list, mid+1, ei);

            return root;
        }
    // BST to => Balanced bst
    public static Node balanceBST(Node root){

        // get intorde arraylist 
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root,list);

        // Arraylist to Balanced BSt
        return createBST(list,0, list.size()-1);
        
    }

    // preorde
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        
        preorder(root);
        System.out.println();
        root = balanceBST(root);
        preorder(root);

    }
}
