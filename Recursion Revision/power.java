public class power {

    public static int pow(int x, int n){
        // base case 
        if(n==0){
            return 1;
        }
        // kam
        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
