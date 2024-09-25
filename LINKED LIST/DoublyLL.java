public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // add first methode
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        

    }

    // remove first

public int removeFirst(){

    if(head == null){
        System.out.println("dll empty");
        return Integer.MIN_VALUE;

    }
    if( head.next == null){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }

    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
}

// remove last
public int removeLast(){
    if(head == null){
        System.out.println("dll empty");
        return Integer.MIN_VALUE;
    }
    if(head.next == null){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    int val = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return val;
}

// reverse Doubly Linked List
public void reverse(){
    // 3 variable
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr != null){
        // 5 step
        next = curr.next;
        curr.next = prev;
        curr.prev = next;

        prev = curr;
        curr = next;
        
    }
    head = prev;
}
    // print Node
    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // print reverrse
    public void printrev(){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
       
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
         
        dll.print();
        dll.reverse();
        dll.print();
    }
}
