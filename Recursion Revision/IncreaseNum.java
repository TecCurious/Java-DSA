public class IncreaseNum {
    public static void increaseNum(int n){
        if(n==0){
            return;
        }

        increaseNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        increaseNum(5);
    }
}
