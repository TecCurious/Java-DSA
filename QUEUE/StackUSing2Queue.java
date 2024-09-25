import java.util.*;
public class StackUSing2Queue {

    static class  Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
            

        // empty
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // add O(n)
        public static void add(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                top = q1.remove();
            }else{
                top = q2.remove();
            }

            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                top = q1.peek();
            }else{
                top = q2.peek();
            }

            return top;
        }
        
        }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.add(1);
        s.add(2);
        s.add(3);
        s.pop();
        s.add(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
