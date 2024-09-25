import java.util.*;

public class ConnectNRopes {
     public static int nRopes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int result = 0;
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        while(pq.size() > 1 ){
            int first = pq.poll();
            int second = pq.poll();

            result += first+second;
            pq.add(first+second);
        }

        return result;
     }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
       System.out.println( nRopes(arr));



    }
}
