public class SellBuyStokes {

    // recusioin
    public static int maxProfit(int price[], int i, int buy , int n){
        // base
        if(i == n){
            return 0;
        }
        int profit = 0;

        if(buy == 1){
            int by = -price[i] + maxProfit(price, i+1, 0, n);
            int notBy = maxProfit(price, i+1, 1, n);

             profit = Math.max(by, notBy);
        } else {
            int sell = price[i] + maxProfit(price, i+1, 1, n);
            int notSell = maxProfit(price, i+1, 0, n);
            profit = Math.max(sell, notSell);
        }

        return profit;
    }

    // Memoization
    public static int maxProfitMem(int price[],int dp[][], int i, int buy , int n){
        // base
        if(i == n){
            return 0;
        }
        int profit = 0;

        if(dp[i][buy] != -1){
           return dp[i][buy];
        }
        if(buy == 1){
            int by = -price[i] + maxProfit(price, i+1, 0, n);
            int notBy = maxProfit(price, i+1, 1, n);

             profit = Math.max(by, notBy);
        } else {
            int sell = price[i] + maxProfit(price, i+1, 1, n);
            int notSell = maxProfit(price, i+1, 0, n);
            profit = Math.max(sell, notSell);
        }

        return dp[i][buy] =  profit;
    }

        //Tabulation Optimixed code // tc = O(n) , sc = o(1)
        public static int maxProfitTab(int price[], int n){

            // table 
            // int dp[][] = new int[n+1][2];
            int dp[] = new int[2];
            dp[0] = 0;
            dp[1] = Integer.MIN_VALUE;

            // initilize, i = n = 0 -> max profit = 0;
            // i , j -> max profit at day i , from buy and sell
           
            // Bottom up
            for(int i = 1; i < n+1; i++){
                int profit = 0;
                for(int buy = 0; buy <= 1; buy++){
                    if(buy == 1){ // if buy = 1 -> buy or not buy
                        profit = Math.max(-price[i-1] + dp[0], dp[1]);// buying or not buying 
                    }  else { 
                        profit = Math.max(price[i-1] + dp[1], dp[0]);// selling or not selling
                    }
                    dp[buy] = profit;
                }
                
            }

            return dp[0];
        }
     public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        // System.out.println(maxProfit(arr, 0, 1, n));

        int dp[][] = new int[n+1][2];
        for(int i=0; i<n; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        // System.out.println(maxProfitMem(arr, dp, 0, 1, n));

        System.out.println(maxProfitTab(arr, n));
     }
}
