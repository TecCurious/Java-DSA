public class MergeSortLL {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
      public static Node head;
        public static Node tail;
        public static int size;

    // add first
    public void addFirst(int data){
        // create a new Node 
        Node newNode = new Node(data);
        size++;
        // when Node are 0
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 
        newNode.next = head;

        // step 3
        head = newNode;
    }

    // add last 
    public void addLast(int data){
        // step 1 create new Node
        Node newNode = new Node(data);
        size++;
        
        // when Node is NUll
        if(head == null){
            head = tail = newNode;

            return;
        }

        // step 1
        tail.next = newNode;
        // step 3
        tail = newNode;
    }

    // print LInked List

    public void print(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in middle at index
    public void addMid(int data , int idx){
        if(head == null){
            System.out.println("index not exist");
            return;
        }
        // find idx previous 
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // newNode link  idx+1 new node
        newNode.next = temp.next;
        // link previous to newNode
        temp.next = newNode;
    }

    // remove Node from first
    public int removeFirst(){
        // specila cases
        if(head == null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // renove first node
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast(){
         if(head == null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // loop for find previus 
        int i=0;
        Node prev = head;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
        
    }

    // dind linked list by itrerative approach
    public int itrerative(int key){
        Node temp = head;
        int i=0;
        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public int recSearch( Node head ,int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        if(temp.data == key){
            return 0;
        }
       int idx = recSearch(temp.next, key);
        if(idx>=0){
            idx++;
        }
        return idx;
    }

    // serch Nth Node From Last and delet it 
    public int removeNth(int n){
        // formula for finding nth node from last by using head 
        // (size-n+1)

        if(n==size){
            int val = head.data;
            head = head.next;
            return val;
        }
        // finding previous
        Node prev = head;
        int i=1;
       
        while(i<size-n){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;

        return val;
    }
// find mid Node
public Node findMidNode(Node head){

    // slow fast approach
    Node slow = head;
    Node fast = head.next;// for finding left half last node
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}


// merge 
public static Node  merge(Node head1,Node head2){

    Node mergedLL= new Node(-1);
    Node temp = mergedLL;
    while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            temp =temp.next;
            head1 = head1.next;
        } else{
            temp.next = head2;
            temp = temp.next;
            head2 =  head2.next;

        }
    }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;

        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 =  head2.next;

        }


    return mergedLL.next;
}
    // merge Sort
    public Node mergeSort(Node head){// tc = O(nlogn)
        // base case
        if(head == null || head.next == null){
            return head;
        }
        // finding mid
        Node mid = findMidNode(head);

        Node rightHead = mid.next;
        mid.next= null;

        Node newLeft = mergeSort(head);//left half
        Node NewRight =mergeSort(rightHead);// right half

        // merge sorted linked list
       return merge(newLeft,NewRight);

    }


    // zig- zag 
    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rightHead = slow.next;
        slow.next = null;

        //revse second half
        Node prev = null;
        Node curr = rightHead;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        // merge in zig zag fasion
        Node left = head;
        Node right = prev;
        Node nextL ,nextR;
       
        while(left !=null && right != null){
            //zig zag
          nextL = left.next;
          left.next= right;
          nextR = right.next;
          right.next = nextL;
            // update
            right = nextR;
            left = nextL;

        }
    }
    public static void main(String[] args) {
       MergeSortLL ll = new MergeSortLL();
      ll.addLast(1);
      ll.addLast(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.addLast(5);
       
    //   System.out.println(ll.removeNth(2));
      
    //   System.out.println(ll.removeNth(4));
    //   ll.print();
    // ll.head = ll.mergeSort(head);
    ll.print();
    ll.zigZag();
    ll.print();

    }
}
