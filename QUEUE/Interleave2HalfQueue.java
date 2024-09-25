import java.util.*;
public class Interleave2HalfQueue {
    
    public static void interleav(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++){
            first.add(q.remove());
        }

       
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        interleav(q);

        System.out.println(q);
    }
}
