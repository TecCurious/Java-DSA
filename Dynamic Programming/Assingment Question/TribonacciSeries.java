public class TribonacciSeries {

    public static void printTrib(int n){
        // Initialization
        // dp[i] = i+1th tribonaci number
        int dp[] = new int[n];
        // given 0th = 1st = 0, 2nd = 1;
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3; i<n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // print tribonacci n terms
        for(int i=0; i<n; i++){
            System.out.print(dp[i] + " ");
        }

    }
    public static void main(String[] args) {
        printTrib(10);
    }
}