import java.util.*;

public class QueUsing2Stack2 {

    static class Queue {
       static  Stack<Integer> s1 = new Stack<>();
       static  Stack<Integer> s2 = new Stack<>();

        // is emty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add 
        public static void add(int data){
            s1.push(data);
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            while(s1.size() > 1){
                s2.push(s1.pop());
            }

            int top = s1.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
        }

        // peek
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            while(s1.size() > 1){
                s2.push(s1.pop());
            }

            int top = s1.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
