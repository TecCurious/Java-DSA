public class FindFcatorial {
public static int  factorial(int n){
    
    if(n==0){
        return 1;
    }
    // int nM1 = factorial(n-1);
    int fact = n*factorial(n-1);
   return fact;

}

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
