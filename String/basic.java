import java.util.*;
import java.util.Scanner;

public class basic{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        // for only one word
        // name = sc.next();
        name = sc.nextLine();
        
        System.out.println(name.length());


        // concatination
        String first = "prakash";
        String last = "kumar";

        String fullName = first +" "+last;
        System.out.println(fullName);
    }
}