public class MinimumJumps {

    public static int minJumps(int arr[]){
        int n = arr.length;

        // Table
        int dp[] = new int[n];
 
        // initilize , n-1 to n-1 => 0 jumps
        // dp[i] => i to j reach min jumps
        dp[n-1] = 0;

        // initize n-1 with -1 , to chek i to j rech possible or not
        for(int i=0; i<n-1; i++){
            dp[i] = -1;
        }

        // Bootom up
        for(int i=n-2; i>=0; i--){
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1; j<=i+steps && j<n; j++){
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }

        return dp[0];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};

        System.out.println(minJumps(arr));
    }
}
