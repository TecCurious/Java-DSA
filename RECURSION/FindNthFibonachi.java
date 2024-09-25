public class FindNthFibonachi {
    public static int fib(int n){
        // time cpmlexityy )(2^n)  and sapce complexity O(n)
        if(n==1 || n==0){
            return n;
        }
        int fNm1 = fib(n-1);
        int fNm2 = fib(n-2);
        int fb = fNm1+fNm2;
        return fb;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
