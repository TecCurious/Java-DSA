import java.util.*;

public class ValidParentheses {

    public static Boolean isValid(String str){
        // craeting stack
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
                // oprning
            if(ch == '(' || ch == '{' || ch == '[' ){
                s.push(ch);
            }else{
                // closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "{([]}";
        System.out.println(isValid(str));
    }
}
