public class Assignment {
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

// swap Node By the links

public void swapNode(int key1 , int key2){
    if(key1 == key2){
        return;
    }
    Node lcurr = head , rcurr = head;
    Node lpre = null, rpre = null;
   
    while(lcurr.data != key1){
        
        lpre = lcurr;
        lcurr = lcurr.next;
    }

    while(rcurr.data != key2){
        
        rpre = rcurr;
        rcurr = rcurr.next;
    }


    if(lpre != null)
    lpre.next = rcurr;
    else
    head = rcurr;
    if(rpre != null)
    rpre.next = lcurr;
    else
    head = lcurr;


    
    Node temp = lcurr.next;
    lcurr.next = rcurr.next;
    rcurr.next = temp;
     
    
   
}

// odd even linked list

public Node oddEven(){

    if(head == null || head.next == null){
        return head;
    }
   // creating dunmmy odd and even node
     Node evenDummy = new Node(-1);
   Node oddDummy = new Node(-1);

   // dummy node tail
   Node etail = evenDummy;
   Node otail = oddDummy;

   Node curr = head;

   while(curr != null){
    if(curr.data % 2 == 0){
       etail.next = curr;
        etail = etail.next;
    }
    else {
        otail.next = curr;
        otail = otail.next;
    }

    curr = curr.next;
   }
   etail.next = oddDummy.next;
    otail.next = null;
    return evenDummy.next;
}

// reatai mnodes and delet N noded

public void deletnNodes(int M, int N){
    Node curr = head;
    Node d;
    int count;

    // loop for treverse lInked list
    while(curr != null){
        // retain M nodes
        for(count =1; count<M && curr.next != null; count++){
            curr = curr.next;
        }

        d = curr.next;// ratin +1
        for(count = 1; count<= N && d != null; count ++){
            d = d.next;
        }

        // linked after delet N Nodes
        curr.next = d;
        // for reatining linked link
        curr = d;
    }
}
   
   


    
public static void main(String[] args) {
    Assignment ll = new Assignment();
   
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);

ll.print();
ll.deletnNodes(2, 2);
ll.print();


}
}
