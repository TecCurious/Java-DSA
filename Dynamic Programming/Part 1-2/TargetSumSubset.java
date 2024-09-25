public class TargetSumSubset {

    // recursive and memoizaion
    public static boolean isTaegetSum(int arr[], int target, int n,int dp[][]){

        // base case 
        if(target == 0){
            return true;
        }

        if(n < 0){
            return false;
        }

        if(dp[n][target] != -1){
            if(dp[n][target] == 1){
                return true;
            }else {
                return false;
            }
        }

        if(arr[n] <= target){ // vallid
            // include
            boolean inc = isTaegetSum(arr, target-arr[n], n-1,dp);
            boolean exc = isTaegetSum( arr, target, n-1,dp);

            if(inc || exc){
                dp[n][target] = 1;
                return true;
            }
            dp[n][target] = 0;
            return false;
        } else { // not valid
            boolean exc =  isTaegetSum(arr, target, n-1,dp);
            if(exc == true){
                dp[n][target] = 1;
            }else {
                dp[n][target] = 0;
            }
           return exc; 
        }
    }

    // tabulation
    public static boolean isTargetSumTAB(int arr[], int target){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][target+1];

        // i = items ans j = target 

        // 1 base case when target is zero then ans is true our j is taeget so 0th colum is true
        for(int i=0; i<dp.length; i++){
            dp[i][0] = true;
        }

        // 2 base when item id 0 and sum is >0 then ans is false so 0th row is false expexp 0th cell
        // we do not do it becouse java automatically store false when it is initialized

        // tabulation loop

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int v = arr[i-1];

                // include casse
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                } 
                 else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        printdp(dp);
        return dp[n][target];
    }

    public static void printdp(boolean dp[][]){

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int n = arr.length;
        int target = 10;

        int dp[][] = new int[n+1][target+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        // System.out.println(isTaegetSum(arr, target, n-1,dp));
        System.out.println(isTargetSumTAB(arr, target));
    }
}
