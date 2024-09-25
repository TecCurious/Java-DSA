public class OptimizedXN {
    public static int optimixedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpow = optimixedPower(x, n/2);
        System.out.println(halfpow);
        int halfsq = halfpow*halfpow;

        // n odd
        if(n%2 !=0){
            halfsq = x*halfsq;
        }
        return halfsq;
    }

    public static void main(String[] args) {
        System.out.println(optimixedPower(2, 4));
    }
}
