import java.util.Scanner;

public class CodingBlocks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();

        int x[] = new int[T];
        int n[] = new int[T];

        for(int i=0; i<T; i++){
             x[i] =sc.nextInt();
             n[i]=sc.nextInt(); 
            
        }

        for(int i=0; i<T; i++){
            int result = x[i]%n[i];
            System.out.println(result);
            result=0;
        }
    }
}
