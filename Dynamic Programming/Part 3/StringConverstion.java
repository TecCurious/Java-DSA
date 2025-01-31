public class StringConverstion {

    // tabulation methode
    public static void strConve(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int lcs = lcs(str1, str2);

        int del = n - lcs;
        int inse = m - lcs;

        System.out.println("insetion operation->"+inse);
        System.out.println("deletion operation->"+del);
    }
    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        // initialize
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        // Bottom up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1) ){ //same
                    dp[i][j] = dp[i-1][j-1]+1;
                } else { // different 
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        System.out.println(dp[n][m]);
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "deat";
        String str2 = "sea";

        strConve(str1, str2);
    }
}
