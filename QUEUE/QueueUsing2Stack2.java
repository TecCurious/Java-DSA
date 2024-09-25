import java.util.*;
public class QueueUsing2Stack2 {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        
        
        //add
        public static void add(int data){
            s1.add(data);
        }

        // remove
        public static int remove(){
            // transfer s1 elemts into s2
            while(!isEmpty()){
                s2.add(s1.peek());
                s1.pop();
            }

            // remove first element fo s2
            int top = s2.pop();


            // tarnsfer s2 elements in s1
            while(!s2.isEmpty()){
                s1.add(s2.peek());
                s2.pop();
            }
            return top;
        }

        //peek()
        public static int peek(){
               // transfer s1 elemts into s2
            while(!isEmpty()){
                s2.add(s1.peek());
                s1.pop();
            }

            // remove first element fo s2
            int top = s2.peek();


            // tarnsfer s2 elements in s1
            while(!s2.isEmpty()){
                s1.add(s2.peek());
                s2.pop();
            }
            return top;
        }
    }



    public static void main(String[] args) {
        
    Queue q = new Queue();
    
    q.add(1);
    q.add(2);
    q.add(3);

    q.remove();
    q.add(4);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

    }
}
