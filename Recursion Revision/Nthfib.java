public class Nthfib {
    public static int nthFibonachi(int n){
        // base case 
        if(n==0 || n==1){
            return n;
        }
int Nm1 = nthFibonachi(n-1);
        int Nm2 = nthFibonachi(n-2);
        return Nm1+Nm2;
    }
    public static void main(String[] args) {
        System.out.println(nthFibonachi(6));
    }
}
