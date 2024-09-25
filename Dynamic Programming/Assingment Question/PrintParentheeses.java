import java.util.ArrayList;
import java.util.List;

public class PrintParentheeses {

      public static List<String> AllParenthesis(int n) 
    {
        // Write your code here
        char str[] = new char[n*2];
        List<String> list = new ArrayList<>();
        helper(str, list, n, 0, 0, 0);
        return list;
    }
    
    public static void helper(char str[],  List<String> list, int n, int pos, int open , int close){
        
        if (close == n) {
    StringBuilder st = new StringBuilder();
    for (int i = 0; i < str.length; i++) {
        st.append(str[i]);
    }
    list.add(st.toString());
            return;
        }
        
        
        
        if(open > close){
            str[pos] = ')';
            helper(str, list, n, pos+1, open, close+1);
        }
        
        if(open < n){
            str[pos] = '(';
            helper(str, list, n, pos+1, open+1, close);
        }
    }
        


    public static void main(String[] args) {
       List<String> ans =  AllParenthesis(4);
       int i = 0;
       for(String st : ans){
         i++;
       
       }
       System.out.println(i);
    }
}
