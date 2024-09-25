public class MinimumPartisiion {
    public static int minDifferenc(int num[]){
        int n = num.length;
        // finding sum
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += num[i];
        }
        int w = sum/2;

        // 0-1 knapsak
        // Table 
        int dp[][] = new int[n+1][w+1];

        // Intialize
        for(int i=0; i<n+1; i++){
            for(int j=0; j<w+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        // Bootom - up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(num[i-1] <= j){// valid
                  int inc = num[i-1] + dp[i-1][j-num[i-1]];// include 
                   int exe = dp[i-1][j];
                   dp[i][j] = Math.max(inc, exe);
                } else{ // not valid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][w];
        int sum2 = sum - sum1;
        int minDiff = Math.abs(sum1-sum2);

        return minDiff;
    }
    public static void main(String[] args) {
        int num[] = {1,9,11,5};
        System.out.println(minDifferenc(num));

    }
}
