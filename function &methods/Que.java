public class Que {

    public static int factorial(int n){
        int fac = 1;
        for(int i=n; i>=1; i--){
            fac = fac*i;
        }
        return fac;
    }

public static int bionomial(int n, int r){
int nfac = factorial(n);
int rfac = factorial(r);
int n_r = factorial(n-r);

int BIO = nfac/(rfac*n_r);
return BIO;

}
    public static void main(String[] args) {
    //    int fact = factorial(5);
    //    System.out.println(fact);

    // bionomial factorial
    int bio = bionomial(5, 2);
    System.out.println(bio);


    }
}
