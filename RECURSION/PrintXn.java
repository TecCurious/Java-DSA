public class PrintXn {
    public static int aTothePowN(int x, int n){
        if(n==0){
            return 1;
        }
        int pow = x*aTothePowN(x, n-1);
        return pow;
    }
    public static void main(String[] args) {
        System.out.println(aTothePowN(5, 2));
    }
}
