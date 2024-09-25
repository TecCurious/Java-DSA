public class LongestCommonSubstring {

    // tabulation
    public static int longestCommonSubstring(String str1, String str2){
        int n = str1.length(); 
        int m = str2.length();
        int ans = 0;
        // initializat meaning = i,j -> str1(i)  , str2(j)  -> longest common substring length
        int dp[][] = new int[n+1][m+1];

        // base case , //initializat i = n = 0-> length 0 and j = m = 0 -> length 0;
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
                if(str1.charAt(i-1) == str2.charAt(j-1)){// same
                    dp[i][j] = dp[i-1][j-1]+1;
                    
                    ans = Math.max(ans,dp[i][j]);
                } else { // different 
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args){
        String  str1 = "ABCDE";
        String  str2 = "ABGCE";
        
        System.out.println(longestCommonSubstring(str1, str2));
    }
}
