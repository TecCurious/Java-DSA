public class TillingProblrm {
    public static int  tilling(int n){

  
    // bse case 
    if(n==0 || n==1){
        return 1;
    }

    // kam 
    // horizontal choise 
    int fnm1 = tilling(n-1);

    // vertical choise 
    int fNm2 = tilling(n-2);

    return fnm1+fNm2;

}
    public static void main(String[] args) {
        System.out.println(tilling(5));
    }
}
