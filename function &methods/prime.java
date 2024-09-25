public class prime {
//     public static boolean isprime(int n){
//         boolean isprime = true;
//         for(int i=2; i<=n-1; i++){
//             if(n%i == 0)
//             isprime = false;
//             break;
//         }
//         return isprime;
//     }

public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n % 2 == 0){
            return false;
        }
    }
    return true;
}

public static void primeInRange(int n){
    for(int i=2; i<=n; i++){
        if(isprime(i)){
            System.out.println(i+"is prime number");
        }
    }
}

    public static void main(String args[]){
// System.out.println(isprime(7));


primeInRange(10);
    }

    
}
