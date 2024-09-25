public class LinkedList2 {

public static class Node {
    int data;
    Node next;

 public Node (int data){
    this.data = data;
    this. next = null;
 }
}

public static Node head;
public static Node tail;

// chek cycle

public static boolean chekcycle(){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
         
        if(slow == fast){
            return true;
        }
    }
    return false;
}

// Remove cycle

public static void removeCycle(){
    // step 1 detect cycle

    Node slow = head;
    Node fast = head;
    boolean iscycle = false;
    while(fast != null && fast.next != null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
        if(slow == fast){
            iscycle = true;
            break;
        }
    }

    if(iscycle == false){
        return;
    }

    // step 2 finding last node
    slow = head;

    Node prev = null;
    while(slow != fast){
        prev = fast;
        fast = fast.next;//+1
        slow = slow.next;//+1
    }

    // step 3 pre.next = null;
    prev.next = null;

}
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp = head.next;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(chekcycle());
        removeCycle();
        System.out.println(chekcycle());
        
    }
}
