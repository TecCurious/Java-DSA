public class TillingProblem {

    public static int tiling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        // kam
        // vertical choise
        int fnm1 = tiling(n-1);
        //horizontal choise
        int fNm2 = tiling(n-2);
    
        int toways = fnm1+fNm2;
        return toways;

    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
}
