public class KthLargestOddNum {

    public static int kthLargestOddNum(int arr[], int k){
        if(k <= 0){
            return 0;
        }

        int L = arr[0];
        int R = arr[1];
        if((R & 1) > 0){
            int count = (int)Math.ceil((R-L+1)/2);// number of odd number int the range

            if(k > count){
                return 0;
            }else{
                // kth largest number if R is odd
                return (R -k*2+2);
            }
        }
        else{
             int count = (int)Math.ceil((R-L+1)/2);// number of odd number int the range

            if(k > count){
                return 0;
            }else{
                // kth largest number if R is even
                return (R -k*2+1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-3 , 3};

        System.out.println(kthLargestOddNum(arr, 1));
    }
}
