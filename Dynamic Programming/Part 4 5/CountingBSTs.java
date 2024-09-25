public class CountingBSTs {

    public static int countBST(int n){
        // Table
        int dp[] = new int[n+1];

        //  intilize , ith = count of bst for i nodes
        // n = 0 , n = 1 -> bst = 1
        dp[0] = 1;
        dp[1] = 1; 

        // ci = bst(i nodes) -> dp[i]
        for(int i=2; i<=n; i++){
            int ans = 0;
            for(int j=0; j<i; j++){
                // catal => dp[i] += dp[j] * dp[i-j-1];
                int left = dp[j]; // left cont of bst
                int right = dp[i-j-1]; // right count of bst

               ans += left * right;
            }
            dp[i] = ans;
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countBST(n)); // 14 
    }
}
