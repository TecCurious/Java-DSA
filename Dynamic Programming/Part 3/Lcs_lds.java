import java.util.*;
public class Lcs_lds {

    public static int lis(int arr[], int idx, int prev, int n){
        if( idx >= n){
            return 0;
        }

        if( prev == -1 || arr[idx] < arr[prev]){
           int add = lis(arr, idx+1, idx, n)+1;
           int notAdd = lis(arr, idx+1, prev, n);
           return Math.max(add, notAdd);
        }else {
            return lis(arr, idx+1, prev, n);
        }

    }

    //tabulation
    public static int lisTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n+1][n+1];


        for(int i=1; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                if(arr[i-1] > arr[j]){
                    dp[i][j] = Math.max(dp[i-1][j] +1 , dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][n];
        
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,5,6,2,3,1,10};
        System.out.println(lis(arr, 0, -1, arr.length));
         System.out.println(lisTab(arr));
    }
}
