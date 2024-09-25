class TreeBinary {

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


    // find height
    public static int height(Node root){
        // base case 
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // diameter of tree
     public static int diameter(Node root){ // O(n^2);
        // base case 
        if(root == null){
            return 0;
        }

        int leftDia = diameter(root.left);
        int leftHt = height(root.left);
        int rightDia = diameter(root.right);
        int rightHt = height(root.right);

        return Math.max(rightDia, Math.max(leftDia, rightHt + leftHt + 1));

     }


     static class Info {
        int diam;
        int ht;

       public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
        // diameter of tree  O(n)
        public static Info diameter2(Node root){
            // base case
            if(root == null){
                return new Info(0, 0);
            }

             Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int dia = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

            return new Info(dia, ht);
        }
    
    
    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \   \
          4   5   6
         
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right = new Node(3);
         root.right.right = new Node(6);

        //  System.out.println(height(root));
        // System.out.println(diameter(root));
       System.out.println(diameter2(root).diam);

    }
}