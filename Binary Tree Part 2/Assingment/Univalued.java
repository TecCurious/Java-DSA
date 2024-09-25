class Univalued {

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


    public static boolean helper(Node root, int val){
        if(root == null){
            return true;
        }

        if(val != root.data){
            return false;
        }

        return helper(root.left, val) && helper(root.right, val); 


    }
    // fucntiion for find the all node data is same or note
    public static boolean univalued(Node root){
        int val = root.data;
       return helper(root, val);
    }
    public static void main(String[] args) {
        
        Node root = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);

        System.out.println(univalued(root));
    }
}
