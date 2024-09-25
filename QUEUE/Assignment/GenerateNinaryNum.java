import java.util.*;
public class GenerateNinaryNum {

    public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
          q.add("1");
        for(int i=1; i<=n; i++){
          

            String str1 = q.peek();
            q.remove();
            String str2 = str1;
             System.out.print(str1+" ");
            q.add(str1+"0");
            q.add( str2+"1");
           
        }

    }
    public static void main(String[] args) {
        int n= 5;
        generateBinary(10);
    }
}
