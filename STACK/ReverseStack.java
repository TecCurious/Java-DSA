import java.util.*;
public class ReverseStack {

    // push bottom
    public static void pushBottom(Stack<Integer> s, int data){
        // base case 
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    // reverse stack 
    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    // print Stack
    public static void print(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        print(s);

    }
}
