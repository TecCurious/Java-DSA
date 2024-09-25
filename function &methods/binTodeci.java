public class binTodeci {

    public static void binariTodecimal(int n){
        int last=0;
      int decimal=0;
        for(int i=0; n>0; i++){
            int pow =(int) Math.pow(2,i);
            last = n%10;
            decimal = decimal+(last*pow);
            n=n/10;
        }
       System.out.println(decimal);
    }
    public static void main(String args[]){
binariTodecimal(1000);

    }
}
