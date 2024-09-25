public class max {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = 2;
        int c = 5;

        int min = Math.min(a, Math.min(b, c));

        System.out.println(min);

        System.out.println(Integer.MAX_VALUE);
        
    }
}
