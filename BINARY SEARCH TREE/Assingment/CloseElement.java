public class CloseElement {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }
    }
        static int minDiff = Integer.MAX_VALUE;
        static Node node = null;
    public static void closeElement(Node root , int k){  // tiem complexity = O(H) > H = Height;
        if(root == null){
            return;
        }

       
            
        // if(root.data > k){
            if((Math.abs(root.data - k)) < minDiff){
                node = root;
                minDiff = Math.abs(root.data - k);
            
        }
    // }
    // else {
    
    //     if((k - root.data ) < minDiff){
    //         node = root;
    //         minDiff = k-root.data;
    
    // }

        if(root.data >k){
            closeElement(root.left, k);
        }else{
            closeElement(root.right, k);
        }
        

    }




    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

        closeElement(root, 5);
        System.out.println(node.data);

    }
}
