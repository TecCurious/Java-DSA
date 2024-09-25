public class decTobin {

// function for decimal to binary
public static void  decimalTobinary(int n){
    int num =n;
int binary =0;
int rem = 0;
int power =0;
while(n>0){

    rem = n%2;
    binary = binary+(int)(rem*Math.pow(10,power));
    n=n/2;
    power++;
}
System.out.println("decimal of "+num +" is :"+binary);
}

     public static void main(String[] args) {
        decimalTobinary(8);
        
    }
}
