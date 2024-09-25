import java.util.Arrays;

public class CatalanNumber {
        // Recurtion
    public static int catalanRec(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int ans = 0; 

        for(int i=0; i<n; i++) {
            ans += catalanRec(i) * catalanRec(n-i-1);
        }

        return ans;
    }

    // Memoization
    public static int catalanMem(int n, int dp[]){
        if(n == 1 || n == 0){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans += catalanMem(i, dp) * catalanMem(n-i-1, dp);
        }
        return dp[n] = ans; 
    }

    // Tabulation
    public static int catalanTab(int n){
        // 1 Table
        int dp[] = new int[n+1];

        // Initialize. , d[i] = ith catalan 
        // oth catalan = 1; and 1th catalan = 1;
        dp[0] = 1;
        dp[1] = 1;

        // Bottom up
        for(int i=2; i<=n; i++){
            int ans = 0;
            for(int j=0; j<i; j++){
                ans += dp[j] * dp[i-j-1];
            }
            dp[i] = ans;
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(catalanRec(n));
       int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        // memoizatiion call
        System.out.println(catalanMem(n, dp));

        System.out.println(catalanTab(n));

    }
    
}
