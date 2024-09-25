import java.util.*;
public class ConnectNropes {

    public static int connectRopes(int ropes[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = ropes.length;
        for(int i=0; i<n; i++){
            pq.add(ropes[i]);
        }
        int ans = 0;
        while (!pq.isEmpty()) {
            int first = pq.remove();
            int second = pq.remove();
            ans += first+second;

            if(!pq.isEmpty()){
                pq.add(first+second);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int ropes[] = {4,3,2,6};

        System.out.println(connectRopes(ropes));
    }
}
