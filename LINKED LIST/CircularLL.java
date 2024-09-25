public class CircularLL {

    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;


    // add first
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head;

        }

        public void print(){
            Node temp = head;
            System.out.print(temp.data+"->");
            while(temp.next!= head){
                 temp = temp.next;
               System.out.print(temp.data+"->");
              
            }
        
        }
    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.print();
    }
}
