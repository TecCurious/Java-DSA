import java.util.ArrayList;

public class Merge2BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }
    }   

    public static void getInorder(Node root , ArrayList<Integer> list){
        if(root == null){
            return;
        }

        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static void merge(ArrayList<Integer> merged , ArrayList<Integer> list1 , ArrayList<Integer> list2){

        int i = 0;
        int j=0;
        while (i<list1.size() && j < list2.size()) {
            if(list1.get(i) < list2.get(j)){
                merged.add(list1.get(i));
                i++;
            }else {
                merged.add(list2.get(j));
                j++;
            }

        }

        while (i<list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            merged.add(list2.get(j));
            j++;
        }
    }

    // crating Blanced bst using sorted Array

    public static Node createBST(ArrayList<Integer> list , int si, int ei){

        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, si, mid-1);
        root.right = createBST(list, mid+1, ei);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){

        
        // Step 1
        ArrayList<Integer> bst1 = new ArrayList<>();
        getInorder(root1 , bst1);
        
        //Step 2
        ArrayList<Integer> bst2 = new ArrayList<>();
        getInorder(root2 , bst2);
        
        // step 3
         
        ArrayList<Integer> merged = new ArrayList<>();
        merge(merged , bst1 , bst2);

        // Sep 4 crating a balanced BST using merged sorted ArrayList
        return createBST(merged , 0, merged.size()-1);

        
    }

    public static void preorde(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data +  " ");
        preorde(root.left);
        preorde(root.right);
    }
    public static void main(String[] args) {
        
        //first BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // second BST 
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        
        Node root = mergeBST(root1, root2);

        preorde(root);


    }
}
