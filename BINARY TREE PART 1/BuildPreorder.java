import java.util.*;
class BuildPreorder {

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


    

    static class BinaryTree {
        static int idx = -1;
        public static Node BuildTree(int Nodes[]){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = BuildTree(Nodes);
            newNode.right = BuildTree(Nodes);

          return newNode;

        }
       

        public static void preorder(Node root){
            if(root ==  null){
                System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");

            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            // base case
            if(root == null){
            return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }


        public static void levelOrder(Node root){

            if(root == null){
                return;
            }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");

            if(currNode.left != null){
                q.add(currNode.left);
            }

            if(currNode.right != null){
                q.add(currNode.right);
            }
            }
        }


     }

     public static int height(Node root){
        // base case 
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int height = Math.max(lh, rh)+1;
        
        return height;
     }

    }
    public static void main(String[] args) {
        
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(Nodes);

        System.out.println(tree.height(root));
    }
}
                    