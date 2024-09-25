public class LCS {

    // recursion
    public static int lcs(String str1, String str2, int n, int m){
        if(n < 0 || m < 0){
            return 0;
        }

        if(str1.charAt(n) == str2.charAt(m)){ // common
            return lcs(str1, str2, n-1, m-1) + 1;
        } 
        else { // different
            int ans1 = lcs(str1, str2, n-1, m);// n-1
            int ans2 = lcs(str1, str2, n, m-1);// m-1

            return Math.max(ans1, ans2);
        }
    }

    // memoization
    public static int lcsMem(String str1, String str2, int n, int m, int dp[][]){
        if(n < 0 || m < 0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n) == str2.charAt(m)){ // common
            dp[n][m] = lcsMem(str1, str2, n-1, m-1, dp) + 1;
            return dp[n][m];
        } 
        else { // different
            int ans1 = lcsMem(str1, str2, n-1, m, dp);// n-1
            int ans2 = lcsMem(str1, str2, n, m-1, dp);// m-1

            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }


    // Tabulation tc = 0(n * m);
    public static int lcsTab(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        StringBuilder ans = new StringBuilder();
        // intitalization . n = 0; and m = 0 -> lcs = 0
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        // fillint small to large
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){

                if(str1.charAt(i-1) == str2.charAt(j-1)){ // same
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans.append(str1.charAt(i-1));
                } else { // different
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        System.out.println(ans);
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "edocteel"; // lcs "ace" length = 3;
        int n = str1.length();
        int m = str2.length();
        // System.out.println(lcs(str1, str2, n-1, m-1));

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }

        // System.out.println(lcsMem(str1, str2, n-1, m-1, dp));

        // Tab
        System.out.println(lcsTab(str1, str2));
    }
}
