public class MountainRanges {
    public static int mountainRanges(int n){
        
        int dp[] = new int[n+1];
        // oth and 1th moutainrnges => 1
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            // i pairs -> mountain Ranges -> ci
            int ans = 0;
            for(int j=0; j<i; j++){
                int inside = dp[j];// Co => dp[j]
                int outside = dp[i-j-1]; // Cn-1 => dp[i-j-1] 
                ans += inside * outside;
         }
         dp[i] = ans;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }
}
