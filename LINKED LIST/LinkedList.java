import org.w3c.dom.Node;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

     
    public void addFirst(int data){
        // step fisrt creat a new node 
        Node newNode = new Node(data);
        size++;
        if(head == null){
             head = tail = newNode;
             return;
        }
        //new node's next = head
        newNode.next = head;// link 
       
        // step 3 head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step first create a node
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
        }

        // tail.next = newNode
        tail.next = newNode;

        //making tail last added in last 
        tail = newNode;
    }

    // function for prnt linked list 
    public void print(){// O(n)
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){


        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;

        temp.next = newNode;
    }

    // remove first
    public int  removeFirst(){

        // special cases
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
             head = tail = null;
             size=0;
             return val;
             
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast(){
        // specila cases 
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // loop for find previous
        Node prev = head;
        for(int i=0; i<size-2; i++){
        prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
// search by fore loop;
    public int itrSerach(int key){// O(n)
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
           
          temp = temp.next;
          i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        // base case
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

       int idx = helper(head.next, key);
        if(idx >=0){
            idx++;
        }
        return idx;
    }

    // search by recursion
public int recSearch(int key){// O(n)
   return helper(head,key);
}

// reverse linked List
public void reverse(){
    Node prev = null;
    Node curr = tail = head; // assingnment right to left
    Node next;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;
}

// delet Nth Node from end
public void removeNthFromEnd(int n){
    // counting node size
    int sz =0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }

    // for first node
    if(n==sz){
        head = head.next;
        return;
    }

    int i=1;
    int idx = sz-n;
    Node prev = head;

    while(i<idx){
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;

}


/// step 1 finding mid
public static Node  findMidNode(Node head){// helper function
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;//+1
        fast= fast.next.next;//+2
    }

    return slow;
}

public boolean chekPalindrome(){
    if(head==null || head.next == null){
        return true;
    }


    // step 1 find mid node
    Node midNode = findMidNode(head);

    // step 2 reverse second half ll
    Node prev = null;
    Node curr = midNode;

    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }

    Node right = prev;
    Node left = head;

    // chek left and right part are equal
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
return true;
}

// cycle finding in ll
public static boolean chekCycle(){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;//+1
        fast = fast.next.next; //+2
         if(fast == slow){
            return true;
         }

    }
    return false;
}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
       
        // ll.addLast(1);
        // ll.addLast(3);
        // ll.addLast(1);
        // ll.addLast(4);
     
        // ll.add(2,9);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll.itrSerach(9));
        // System.out.println(ll.recSearch(10));
        // ll.print();
        // System.out.println(ll.size);
       
        // ll.reverse();
//          ll.print();
//         ll.removeNthFromEnd(3);
//  ll.print();
// System.out.println(ll.chekPalindrome());

// cycle node
 
head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
// head.next.next.next = head;
        
System.out.println(chekCycle());
    }
}