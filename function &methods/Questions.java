public class Questions {
    // Q-1 avarge of three number
    // public static int avage(int a, int b,int c){
    //     int avarage = (a+b+c)/3;
    //     return avarage;
    // }

// Q-2 check even
// public static boolean isEven(int n){
//     if(n%2 ==0){
//     return true;
//     }
//     return false;

// }

//Q-3 check palindran;
// public static boolean isPlidrom(int n){
// int num=n;
// int rem=0;
// int reverse=0;
// while(n>0){
//     rem = n%10;
//     reverse=(reverse*10)+rem;
//     n=n/10;
// }
// if(reverse==num){
//     return true;
// }
// return false;
// }

// Q-5 sum of digit
public static int sumOfdigit(int n){
    int sum=0;
    int rem =0;
    while(n>0){
        rem=n%10;
        sum = sum+rem;
        n=n/10;
    }
    return sum;
}


    public static void main(String args[]){
// System.out.println(avage(2,3,4));

// System.out.println(isEven(6));

// System.out.println(isPlidrom(212));

System.out.println(sumOfdigit(555));

    }
}
