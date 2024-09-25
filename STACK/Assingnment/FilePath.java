import java.util.*;
public class FilePath {

    public static String filepath(String path){
        Stack<String> st = new Stack<>();
        String res = "/";


        // treverse all the path
        for(int i=0; i<path.length(); i++){
            // 1 split string by '/'
            String dir = "";
            while(i<path.length() && path.charAt(i) == '/'){
                i++;
            }

            while(i<path.length() && path.charAt(i) != '/'){
            dir+= path.charAt(i);
            i++;
            }
            //2 pop and push
            if(dir.equals("..")){
                st.pop();
            }

            else if(dir.equals(".")){
                continue;
            }else if(dir.length() != 0){
                st.push(dir);
            }

            
        }

        // 3 return res
        // crating new stack for rese the first stack
        Stack<String> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }

        while(!st1.isEmpty()){
            if(st1.size() != 1){
                res+=st1.pop()+"/";
            }else{
                res+=st1.pop();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String path = "/prakash/a//../c";
        System.out.println(filepath(path));
    }
}
