import java.util.*;
public class ReverseStringUsingStack {
    public static String reverseString(String str){
        Stack<Character> c = new Stack<>();
        // adding string value in stack
        int idx = 0;
        while(idx <str.length()){
            c.push(str.charAt(idx));
            idx++;
        }

        // reverse add in to new string
        StringBuilder newstr = new StringBuilder("");

        while(!c.isEmpty()){
            char ch = c.pop();
            newstr.append(ch);
        }

        return newstr.toString();
    }
    public static void main(String[] args) {
       
        String str = "Hello world";

        String reverse = reverseString(str);

        System.out.println(reverse);

    }
}
