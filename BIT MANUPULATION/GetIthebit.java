public class GetIthebit {
    public static void getIthBit(int n , int i){
        int bitmask = (1<<i);
        if((n&bitmask)==0){
            System.out.println(n+"," +i+"th bit is zero");
        }else{
            System.out.println(n+","+i+"th bit is one");
        }
    }
    public static void main(String[] args) {
        getIthBit(12, 3);
    }
}
