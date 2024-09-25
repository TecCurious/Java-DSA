public class UnboundedKnapsak {
     //Unbounded knapsak memoization
     public static int unboudedknapsakMem(int val[], int wt[], int w , int n, int[][] dp){

        // base case
        if(n == 0 || w == 0){
            return 0;
        }

        // memoization 
        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w){ // valid
            // include 
            int ans1 = val[n-1]+ unboudedknapsakMem(val, wt, w-wt[n-1], n, dp);

            // exlude 
            int ans2 = unboudedknapsakMem(val, wt, w, n-1, dp);

            dp[n][w] = Math.max(ans1, ans2);

            return dp[n][w];
        } else { // not valid
            dp[n][w] = unboudedknapsakMem(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};

        int wt[] = {2,5,1,3,4};
        int w = 7;

        int dp[][] = new int[val.length+1][w+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(unboudedknapsakMem(val, wt, w, val.length-1,dp));
    }
}
