import java.util.*;

public class FillNslots {

    public static int timeToFill(int arr[] , int k, int N){

        Queue<Integer> q = new LinkedList<>();
        // map 
        boolean vis[] = new boolean[N+1];
        for(int i=0; i<k; i++){
            q.add(arr[i]);
            vis[arr[i]] = true;
        }
        int time = 0;
        while (q.size() > 0) {

            for(int i =0; i<q.size(); i++){

            
            int curr = q.poll();

            if(curr-1 >= 1 && !vis[curr-1]){
                vis[curr-1] = true;
                q.add(curr-1);
            }

            if(curr+1 <= N && !vis[curr+1]){
                vis[curr+1] = true;
                q.add(curr+1);

            }

        }
        time++;
        }

        return time-1;

    }
    public static void main(String[] args) {
        int arr[] = {2,6};
        int k = 2;
        int N = 6;

       System.out.println( timeToFill(arr, k, N));
    }
}