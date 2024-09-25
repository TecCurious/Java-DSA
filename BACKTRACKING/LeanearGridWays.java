public class LeanearGridWays {
    public static int fact(int n){

        if(n==1){
            return 1;
        }


        // kam
        return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        int n=3 , m=3;
        int npm = fact((n-1)+(m-1));
       int nm1 =fact(n-1);
       int mm1 =fact(m-1);
      
        System.out.println(npm/(nm1*mm1));
    }
}
