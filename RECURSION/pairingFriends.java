public class pairingFriends {
    public static int pairing(int n){
        if(n==1|| n==2){
            return n;
        }
int fir = pairing(n-1);

int sec = (n-1)*pairing(n-2);

int total = fir+sec;

    return total;
    }
    public static void main(String[] args) {
        System.out.println(pairing(6));
    }
}
