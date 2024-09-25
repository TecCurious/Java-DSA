public class DigitToString {
    public static void digitToString(String nums[], int n){
        // base case
        if(n==0){
            return ;
        }
        int ld= n%10;
        
        //kam
        digitToString(nums,  n/10);
        System.out.print(nums[ld]+" ");
        
          
    }
    public static void main(String[] args) {

        String numS[]= {"zero ","one","two","three","four","five","six","seven","eight","nine"};
        String str ="";
        int n = 2023;
        digitToString(numS, n);
    }
}
