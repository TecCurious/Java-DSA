import java.util.*;

public class QueueUsing2Stack {
    static class Queue {
        
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

    // is empty
    public static boolean isEmpty(){
        return s1.empty();
    }
       
        // add  O(n)
         public static void add(int data){
           

            while(!s1.isEmpty()){
                s2.add(s1.peek());
                s1.pop();
            }

            s1.add(data);
            
            while(!s2.isEmpty()){
                s1.add(s2.peek());
                s2.pop();
            }
         }


         // remove

         public static int remove(){
            if(s1.empty()){
                System.out.println("queue is empty");
                return -1;
            }

            int top = s1.peek();
                s1.pop();
                return top;
         }


         // peek
         public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;

            }

            return s1.peek();
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
