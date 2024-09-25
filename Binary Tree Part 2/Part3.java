import java.util.*;
public class Part3 {

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

        public static void kLevel(Node root, int level , int k){
            // base case 
            if(root == null){
                return;
            }
 
            // preorder traversal
            if(level == k){
                System.out.print(root.data+" ");
            }

            kLevel(root.left, level+1, k);
            kLevel(root.right, level+1, k);
        }

        // getPath function
        public static boolean getPath(Node root, int n , ArrayList<Node> path){
                
            // base case
            if(root == null){
                return false;
            }

            path.add(root);
            if(root.data == n){
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight ){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }


        // lowest common ancestor
        public static Node lCA(Node root, int n1, int n2){
            
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);


            // last common ancestor
            int i = 0;
            for(; i<path1.size() && i<path2.size(); i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }

            //last equal node -> i-1th
           Node LCA= path1.get(i-1);

           return LAC;

        }


        // appoach 2 lowest common ancestor  // better approach -> in terms of memory
        public static Node lca2(Node root, int n1, int n2) {
            // base case 
            if(root == null || root.data == n1 || root.data == n2){
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if(leftLca == null){
                return rightLca;
            }

            if(rightLca == null){
                return leftLca;
            }

            return root;
        }

        // helper function of minimum distance between two nodes;
        public static int lcaDist(Node root, int n){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if(leftDist == -1 && rightDist == -1){
                return -1;
        } else if(leftDist == -1){
            return rightDist+1;
        }else {
            return leftDist+1;
        }

        }


        // Minimum distance between two nodes
        public static int minDist(Node root, int n1 , int n2){
          Node lca =   lca2(root, n1, n2);

            int dist1 = lcaDist(lca , n1);
            int dist2 = lcaDist(lca , n2);

            return dist1 + dist2;
        }


        // Kth ancestore of node 
        public static int KthAnc(Node root, int node , int k){
            if(root == null){
                return -1;
            }
            if(root.data == node){
                return 0;
            }

            int leftDist = KthAnc(root.left, node, k);
            int rightDist = KthAnc(root.right, node, k);

            if(leftDist == -1 && rightDist == -1){
                return -1;
            }

            int max = Math.max(leftDist, rightDist);
            if(max+1 == k){
                System.out.println(root.data);
            }

            return max+1;
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
            int k = 1;
        int node = 4;
        // kLevel(root, 1, k);

        int n1 = 4 , n2 = 5; 
        // System.out.println(lca2(root, n1, n2).data);
        // System.out.println(minDist(root, n1, n2));
        KthAnc(root, node, k);
    }
}
