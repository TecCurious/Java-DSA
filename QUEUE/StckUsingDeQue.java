import java.util.*;
public class StckUsingDeQue {

    static class Stack {

      static  Deque<Integer> deque = new LinkedList<>();

        // add
        public  static void push(int data){
            deque.addLast(data);
        }

        //remove
        public static int pop(){
            return deque.removeLast();
        }

        // peek
        public static int peek(){
            return deque.getLast();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
