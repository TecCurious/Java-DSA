public class twoPower {
    public static boolean isTwoPower(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isTwoPower(7));
    }
}
