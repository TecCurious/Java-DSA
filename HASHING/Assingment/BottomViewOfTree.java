import java.util.*;

public class BottomViewOfTree {

    public static class Node {
        int data; 
        Node left; 
        Node right;


        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
  
        }
    }

    public static class Pair {
        Node node;
        int hd;

        Pair(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void bottomView(Node root){
       Queue<Pair> q = new LinkedList<>();
       HashMap<Integer , Integer> map = new HashMap<>();
        int min = 0;
        int max = 0;
       q.add(new Pair(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else {

                map.put(curr.hd, curr.node.data);

                if(curr.node.left != null){
                    q.add(new Pair(curr.node.left, curr.hd-1));
                    min = Math.min(min , curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Pair(curr.node.right, curr.hd+1));
                    max = Math.max(max , curr.hd+1);
                }
            }
        }

       // Printing bottom view
       for(int i=min; i<=max; i++){
        System.out.print(map.get(i)+" ");
       }
       
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);


        bottomView(root);
    }
}
