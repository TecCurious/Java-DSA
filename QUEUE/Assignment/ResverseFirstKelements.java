import java.util.*;
public class ResverseFirstKelements {
    public static void reverseKElements(Queue<Integer> q, int k){
       Stack<Integer> s = new Stack<>();

        int size = q.size();

        for(int i=0; i<k; i++){
            s.push(q.remove());

        }
       
        for(int i=0; i<k; i++){
            q.add(s.pop());
        }

       for(int i= size-k; i>0; i--){
           q.add(q.remove());
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        int k = 4;
        System.out.println(q);
        reverseKElements(q, k);
        System.out.println(q);
    }
}
