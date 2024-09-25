import java.util.*;

import javax.swing.plaf.nimbus.State;
public class QueueUSingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    static class Queue{
       static Node head;
       static Node tail;
    
       // is empty
       public  static boolean isEmpty(){
        return head == null && tail == null;

       }

       // add
       public static void add(int data){
        Node NewNode = new Node(data);

        if(head == null){
            head  = tail = NewNode;
            return;
        }

        tail.next = NewNode;
        tail = NewNode;

       }


       // remove
       public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
     
        return top;
       }

    // peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }

        return head.data;

    }

    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
