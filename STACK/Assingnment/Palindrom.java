import java.util.*;
public class Palindrom{


    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Boolean isPalindrom(Node head){
        Stack<Integer> s = new Stack<>();

        // adding character in stack
        Node temp = head;
        while(temp != null){
            s.push(temp.data);
            
            temp = temp.next;
           
        }

        // chekking palindrom
        

        while(head != null){
            if(head.data != s.peek()){
                return false;
            }
            head = head.next;
            s.pop();
        }

        return true;
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        // Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        // six.next = seven;

        System.out.println(isPalindrom(one));

    }
}