public class RodCutting {

    // wt = length; val = price; w = toRoad;
    public static int rodCutting(int length[] , int price[], int toRod){

        int n = price.length;

        // table dp Array
        int dp[][] = new int[n+1][toRod+1];

        // initialization , i = n = 0 -> 1 , j = 0 = toRod -> 0
        for(int i=0; i<n+1; i++){
            for(int j=0; j<toRod+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<toRod+1; j++){
                if(length[i-1] <= j) {// valid
                dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else { // not valid
                    dp[i][j] = dp[i-1][j];
                }
            } 
        }

        return dp[n][toRod];
        }
           

         
    
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8,};
        int price[] = {1,5,8,9,10,17,17,20};
        int toRod = 8;

        System.out.println(rodCutting(length, price, toRod));
    }
}
