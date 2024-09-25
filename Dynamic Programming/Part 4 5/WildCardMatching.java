public class WildCardMatching {

    public static boolean isMatch(String str , String pat){
        int n = str.length();
        int m = pat.length();

        boolean dp[][] = new boolean[n+1][m+1];

        // intialize 
        // i = 0 , j = 0; -> true
        dp[0][0] = true;

        // s=i= 1,3,4;  p=j=0 -> false ; or  pattern = " ";
        for(int i=1; i<n+1; i++){
            dp[i][0] = false;
        }

        // s=i=0; p=j= 1,3,3 or a*?: or string = " ",
        for(int j=1; j<m+1; j++){
            if(pat.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            } else {
                dp[0][j] = false;
            }
        }


        //  bottom up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                // case 1 ith char == jth char || jth char == '?'
                if(str.charAt(i-1) == pat.charAt(j-1) || pat.charAt(j-1) == '?'){
                   
                    dp[i][j] = dp[i-1][j-1];
                }  // case 2 jth char == '*';
                else if(pat.charAt(j-1)  == '*'){  
                    boolean ing = dp[i][j-1]; // * ingnore
                    boolean match = dp[i-1][j];// * match

                    dp[i][j] = ing || match; // any one rentun ture to i,j = true else false
                } else { // case 3 jth char is not matching with ith char and jth char is not '?' , '*'
                    dp[i][j] = false; 
                }
            }
        }

        return dp[n][m];

     }

    public static void main(String[] args) {
        String str = "baaabab";
        String pattern = "*****ba*****ab";

        System.out.println(isMatch(str, pattern));

    }
}