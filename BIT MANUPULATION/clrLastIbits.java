public class clrLatIthbits {
    public static int CleariBits(int n , int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(CleariBits(15, 2));
    }
}
