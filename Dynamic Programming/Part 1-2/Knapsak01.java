public class Knapsak01 {

    public static int knapsak(int val[], int wt[], int w, int n){
        // base case
        if(n == 0 || w == 0){
            return 0;
        }

        if(wt[n-1] <= w){ // valid
            // include
            int ans1 = val[n-1] + knapsak(val, wt, w-wt[n-1], n-1);

            // exclude
            int ans2  = knapsak(val, wt, w, n-1);

            // ans is max of ans1 and ans2
            return Math.max(ans1, ans2);
        } else { // not valid
            return knapsak(val, wt, w, n-1);
        }
    }

    // knapsak memoization
    public static int knapsakMem(int val[], int wt[], int w , int n, int[][] dp){

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
            int ans1 = val[n-1]+ knapsakMem(val, wt, w-wt[n-1], n-1, dp);

            // exlude 
            int ans2 = knapsakMem(val, wt, w, n-1, dp);

            dp[n][w] = Math.max(ans1, ans2);

            return dp[n][w];
        } else { // not valid
            dp[n][w] = knapsakMem(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    public static void printdp(int dp[][]){

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Tabulation
    public static int knapsakTab(int val[], int wt[], int w ){
        int n = val.length;

        int dp[][] = new int[n+1][w+1];// to store the max of nth tern for N+1 , w+1

        for(int i=0; i<dp.length; i++){ // oth column
            dp[i][0] = 0;
        }

        for(int i=0; i<dp[0].length; i++){ // 0th row
            dp[0][i] = 0;
        }

        // tabulation loop
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                int v = val[i-1];
                int wtt = wt[i-1];

                if(wtt <= j){ // valid 
                    int incProfit = val[i-1] + dp[i-1][j-wtt]; // include
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // not valid
                   int excProfit = dp[i-1][j];
                   dp[i][j] = excProfit;
                }
            }
        }

        printdp(dp);
        return dp[n][w];
    }


    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};

        int wt[] = {2,5,1,3,4};
        int w = 7;

        // System.out.println(knapsak(val, wt, w, val.length));

        //memoization dp[][]
        int dp[][] = new int[val.length+1][w+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        // System.out.println(knapsakMem(val, wt, w, val.length, dp));
        System.out.println(knapsakTab(val, wt, w));

       



    }
}
