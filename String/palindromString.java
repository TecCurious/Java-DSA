import java.util.*;
public class palindromString {
    // function fore chaking the string is palindrom or note
    public static boolean isplindrom(String str){
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                // note palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "car";
      System.out.println(isplindrom(string));  

    }
}
