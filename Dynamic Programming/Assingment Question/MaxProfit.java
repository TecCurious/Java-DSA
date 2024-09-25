public class MaxProfit {

    public static void maxProfit(int arr[], int ans[] , int n, int fee){

       int sum = 0;
       ans[0] = 0;
       ans[1] = 0;
        int l , r;
       for(int i=1; i<n; i++){
        sum = 0;
        l = 0;
        r = i;
        for(int j=n-1; j>=i; j--){
          int profit = arr[r] - arr[l] - fee;

          if(profit > 0){
            sum = sum+profit;
          }

          if(ans[0] < sum){
            ans[0] = sum;
            ans[1] = i;
          }
          l++;
          r++;
        }
       } 

       System.out.println("max profit ->"+ans[0]);
       System.out.println("max profit day Difference->"+ans[1]);
    }


    
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int fee = 1;
        int ans[] = new int[2];
        maxProfit(arr, ans, n, fee);


    }
}
