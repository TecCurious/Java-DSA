public class FriendsPair {
    public static int friendsPair(int n){
        // base case
        if(n==1|| n==2){
            return n;
        }

        // kam 

        return friendsPair(n-1)+(n-1)*friendsPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPair(4));
    }
}
