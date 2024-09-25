public class SumOfNnum {
    public static int sumOfn(int n){
        // base case 
    if(n==1){
        return 1;
    }

    // kam
    return n+sumOfn(n-1);
    }
   public static void main(String[] args) {
    System.out.println(sumOfn(5));
   } 
}
