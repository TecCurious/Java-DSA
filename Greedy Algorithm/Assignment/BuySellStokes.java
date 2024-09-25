public class BuySellStokes {
    public static int maxProfit(int arr[]){
        int max = 0;
        int buy = arr[0];
        int sell = 0;

        for(int i=1; i<arr.length; i++){
            if(buy > arr[i]){
            buy = arr[i];
        }
        else {
            sell = arr[i] - buy;
            max = Math.max(max, sell);
        }
    }

    return max;
}

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
}
