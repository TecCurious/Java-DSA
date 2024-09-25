public class PhoneDigitCombination {

    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
{'t','u','v'},{'w','x','y','z'}};
    public static void letterCombination(String di){
        int len = di.length();
        if(len==0){
            System.out.print("");
        }

        util(0, len, "", di);

    }

    public static void util(int pos, int len, String  str, String di){
        if(pos==len){
            System.out.print(str+" ");
        }
        else{
            // getting string num value from map 
         char letter[] = L[Character.getNumericValue(di.charAt(pos))];
            for(int i=0; i<letter.length; i++){
                util(pos+1, len, str+letter[i], di);
            }
        }

        
    }

    public static void main(String[] args) {
        letterCombination("23");
    }
}
