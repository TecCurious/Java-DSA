import java.util.PriorityQueue;
public class SlidingWindowMax {

    public static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        Pair(int val , int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            // for assending order
            // return this.val - p2.val;
            // for dessending order
            return p2.val - this.val;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};

        int k = 3;
        int n = arr.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // step 1 add first k in pq (first window)
        
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));

        }
        int res[] = new int[n-k+1];
        // step 2 fist window max
        res[0] = pq.peek().val;
        
        // step 3 loop for reminig windows
        for(int i=k; i<n; i++){
            while (pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        // printing ans
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }

    }
}
