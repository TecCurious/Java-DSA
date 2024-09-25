import java.util.*;
public class ReverseKElements {
    public static void kReverse(Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        
        for(int i=0; i<k; i++){
            q.add(s.pop());
        }

        for(int i=0; i<q.size()-k; i++){
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        kReverse(q, 3);
        
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
