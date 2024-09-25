import org.w3c.dom.Node;

public class MaxPath {

    
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

    public static int helper(Node root , int maxValue[]){
        // base case

        if(root == null){
            return 0;
        }

        int leftSum = Math.max(0, helper(root.left, maxValue));
        int rightSum = Math.max(0, helper(root.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], root.data + leftSum + rightSum);

        return root.data + Math.max(leftSum, rightSum);
    }

    public static int maxPath(Node root){

        int maxValue[] = new int[1];

        helper(root,maxValue);

        return maxValue[0];
    }

    public static void main(String[] args) {
        
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxPath(root));

    }
}
