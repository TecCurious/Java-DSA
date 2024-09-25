public class SumOfnNum {
    public static int sumOfNnum(int n){
        if(n==0){
            return 0;
        }
        int sum = n+sumOfNnum(n-1);
        return sum;
    }
    public static void main(String[] args) {
       System.out.println(sumOfNnum(5)); 
    }
}
