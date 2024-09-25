import java.util.*;
public class generateBinary {
    public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=0; i<n; i++){
            String str1 = q.peek();
            q.remove();
            String str2 = str1;
            
            q.add(str1 + "0");
            q.add( str2 + "1");
            System.out.print(str1+' ');
        }
    }

    public static void main(String[] args) {
        int n =5;

        generateBinary(n);

    }
}
