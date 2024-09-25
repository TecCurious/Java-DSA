import java.util.*;
public class CharAt {
    // print strinh  characte
    public static void PrintString(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String fullName = "prakash kumar";
        PrintString(fullName);

    }
}
