import java.util.*;
public class MergeKList {

    public static class Node {
        int data;
        Node next;

        Node (int data ){
            this.data = data;
            this.next = null;
        }
    }

    static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node n1, Node n2) {
            return Integer.compare(n1.data, n2.data);
        }
    }

    public static Node merge(Node arr[] , int k){

        PriorityQueue<Node> pq = new PriorityQueue<>(new NodeComparator());

        for(int i=0; i<k; i++){
            if(arr[i] != null){
                pq.add(arr[i]);
            }
        }
        if(pq.isEmpty()){
            return null;
        }
        Node head = new Node(0);
        Node last = head;

        while(!pq.isEmpty()){
            Node curr = pq.remove();
            last.next = curr;
            last = curr;

            if(curr.next != null){
                pq.add(curr.next);
            }
        }

        return head.next;

    }
    public static void main(String[] args) {
        
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node head3 = new Node(0);
        head3.next = new Node(9);
        head3.next.next = new Node(10); 
         head3.next.next.next = new Node(11);

         Node a[] = {head1,head2,head3};
         int k = 3;

         Node temp = merge(a, k);

         while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }
        
    }
}
