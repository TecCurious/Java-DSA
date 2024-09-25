import java.util.*;
public class function {

public static int  printhelloWorld(){
System.out.println("hello world");
System.out.println("hello world");
System.out.println("hello world");
return 3;
}

public static int sumcal(int x,int y){ // parameter or formal parameter
   int sum = x+y;
   return sum;
}
// function of prudct od two numbers
public static int productcalculate(int a,int b){
   int product = a*b;
   return product;
}

   public static void main(String[] args) {
      //   printhelloWorld();


Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

int product = productcalculate(a, b);
System.out.println(product);
// int sum = sumcal(a,b);//argument or actual argumnet
// System.out.println(sum);
   }
}