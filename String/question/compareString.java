package question;

import java.util.Arrays;

public class compareString {
    public static void COmpareLeter(String str1,String str2){
    // covert into lowecase
    str1.toLowerCase();
    str2.toLowerCase();
 if(str1.length() == str2.length()){
    //covert into char aarray
    char [] tocharaarray1 = str1.toCharArray();
    char [] tocharaarray2 = str2.toCharArray();

    // sorting array
    Arrays.sort(tocharaarray1);
    Arrays.sort(tocharaarray2);

    boolean result = Arrays.equals(tocharaarray1,tocharaarray2);
    if(result){
        System.out.println(str1+","+str2+"  are anagrams");
    }
    else{
        System.out.println(str1+","+str2+"are note anagrams of each others");
    }

  
    }
    else{
        System.out.println(str1+","+str2 +"  are note anagrams of each others");
    }

    }
    
    public static void main(String[] args) {
        String str1= "prakash";
        String str2 = "kaprsha";
        COmpareLeter(str1, str2);
        
    }
}
