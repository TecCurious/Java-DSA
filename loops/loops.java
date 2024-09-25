
public class loops {
    public static void main(String[] args) {
        // int a;
        // for(a=1; a<=4; a++){
        //     for(int b=1; b<=4; b++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

    // int n= 7011;
    // int reverse = 0;
    // while(n!=0){
    //     int num = n%10;
    //     reverse =reverse*10+num; 
    //     n = n/10;
    // }
    // System.out.println(reverse);


    // int num = 123231;
    // int even=0;
    //  int odd =0;
   
    // while(num!=0){
    //     int n = num%10;
    //     if(n%2==0){
            
    //         even++;
    //     }else{
           
    //          odd++;
    //     }
    //     num = num/10;
    // }
    // System.out.println("even num = "+ even);
    // System.out.println("odd num = "+ odd);

char x ='A';
for(int i=1; i<=4; i++){
    for(int j=1; j<=i; j++,x++){
        System.out.print(x);
    }
    System.out.println();
}


    }
}
