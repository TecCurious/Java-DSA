import java.util.*;
public class LatgestInStream {

    public static ArrayList<Integer> largestInStream(int arr[], int k, int n){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // arraylist for store larges in stream
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){

          if(pq.size() < k){
            pq.add(arr[i]);
          }else {
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
            if(pq.size() >= k){
                ans.add(pq.peek());
            }else {
                ans.add(-1);
            }
        

          
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 4;
        int n = 6;
        
        System.out.println(largestInStream(arr, k, n));

    }
}
