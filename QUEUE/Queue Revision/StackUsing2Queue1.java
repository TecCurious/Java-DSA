import java.util.*;
public class StackUsing2Queue1 {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        //is empty
         public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
         }

         // add
         public static void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }  
                }else {
                     q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }  
                }
            }
             // remove
         public static int pop(){
           if(isEmpty()){
            return -1;
           }
           int top =0;
           if(!q1.isEmpty()){
            top = q1.remove();
           }else {
            top = q2.remove();
           }

           return top;
         }

         // peek
         public static int peek(){
             if(isEmpty()){
            return -1;
           }
           int top =0;
           if(!q1.isEmpty()){
            top = q1.peek();
           }else {
            top = q2.peek();
           }

           return top;
         }
         }
         
    

        
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
