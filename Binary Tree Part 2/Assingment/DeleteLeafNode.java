import org.w3c.dom.Node;

public class DeleteLeafNode {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }



    }

    public static void inOrder(Node root){
        // base case
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static Node deleteLeafNode(Node root , int target){
        if(root == null){
            return null;
        }

        root.left = deleteLeafNode(root.left , target);
        root.right = deleteLeafNode(root.right , target);

        if(root.data == target && root.left == null && root.right == null){
            root = null;
        }

        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right = new Node(3);

        inOrder(root);
        deleteLeafNode(root,3);
        System.out.println();
        inOrder(root);
    }
}
