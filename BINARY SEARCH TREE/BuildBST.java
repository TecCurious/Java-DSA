import java.util.*;

public class BuildBST {

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

    // insertin value in a BST
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            // for left subtree
           root.left =  insert(root.left, val);

        }else {
            // for right subtree
           root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder treversal
    public static void inorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search in bst 
    public static boolean search(Node root, int key){ // time complexity O(H);
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left , key);
        }else {
            return search( root.right, key);
        }

        
    }

    // delete in BST
    public static Node delete(Node root , int val){

        if(root.data > val){
            root.left = delete(root.left, val);
        } else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else { //  case 1 when node is a leaf node 
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 when node have only one child
            if(root.left == null){
                return root.right;
            }

            if(root.right == null){
                return root.left;
            }


            // case 3 when node have both child , left and right;
            Node SI = findInorderSuccessor(root.right); // finding Inorder Successor

            root.data = SI.data;

           root.right =  delete(root.right, SI.data);
        }

        return root;
    }

    // finding Inorder successor   , which is root Node right subtree leftmost Node
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    // print in range

    public static void printInRange(Node root , int k1 , int k2){
        // base case 
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+ " ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1){
            printInRange(root.right, k1, k2);
        }else {
            printInRange(root.left, k1, k2);
        }
    }


    // helper fuction for print path
    public static void printPath(ArrayList<Integer> path){

        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    // root to leaf path
    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){

                // base case
            if(root == null){
                return;
            }
            path.add(root.data);
           if(root.left == null && root.right == null){
                printPath(path);
           }
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
            path.remove(path.size()-1);
    }

    // Validate BST , cheking a BST is valid or not
    public static boolean isValidBST(Node root , Node min , Node max){
            if(root == null){
                return true;
            }

            if(min != null && root.data <= min.data){
                return false;
            }

            if(max != null && root.data >= max.data){
                return false;
            }

            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
     

    // Making mirror of a BST
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftChild = mirror(root.left);
        Node rightChild  = mirror(root.right);

        // swaping 
        root.left = rightChild;
        root.right = leftChild;

        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};

        int n  = values.length;
        Node root = null;

        for(int i=0; i<n; i++){
           root =  insert(root, values[i]);
        }

         inorder(root);
        //  System.out.println(search(root, 8));
        // delete(root, 3);
        System.out.println();
        // inorder(root);
        // printInRange(root, 5, 12);

        ArrayList<Integer> path = new ArrayList<>();

        // printRoot2Leaf(root, path);

    //    System.out.println(isValidBST(root, null, null));

    mirror(root);
    inorder(root);



        

        
    }
}