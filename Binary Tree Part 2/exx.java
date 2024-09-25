import org.w3c.dom.Node;

public class exx {

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
         public static void print(Node root){
            if (root.right == null) {
                System.out.println("null");
            }
            if(root.left == null){
                System.out.println("null");
            }
         }
    public static void main(String[] args) {
        Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        print(root);



    }
}
