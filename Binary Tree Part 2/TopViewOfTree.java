import java.util.*;



public class TopViewOfTree {

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

    static class Info {
        int hd;
        Node node;

        Info (int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }


    public static void topView(Node root) {
        
        Queue<Info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0 , max = 0;

        q.add(new Info(0, root));
        q.add(null);

        while(!q.isEmpty()){
            Info cur = q.remove();

            if(cur == null) {
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else {

                if(!map.containsKey(cur.hd)){
                    map.put(cur.hd, cur.node);
               }

                    
                if(cur.node.left != null){
                    q.add(new Info(cur.hd-1, cur.node.left));
                    min = Math.min(min, cur.hd-1);
                }

                if(cur.node.right != null){
                    q.add(new Info(cur.hd+1, cur.node.right));
                    max = Math.max(max, cur.hd+1);
                }
            }
        }
            //printing top view nodes
                
            for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data+" ");
            }
           
        

    }

    public static void main(String[] args) {
        /*
        
           1
         /   \
        2     3
       / \   /  \
      4   5 6    7


         */

         Node root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(6);
root.right.right = new Node(7);

        topView(root);
    }
}
