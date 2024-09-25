public class modularExponentiation {
    public static int MOdularExpo(int a,int n,int p){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            n=n>>1;
            a=a*a;
        }
        return ans%p;
    } 
    public static void main(String[] args) {
        int a=2;
        int n=5;
        int p=13;
        System.out.println(MOdularExpo(a, n, p));
    }
}
