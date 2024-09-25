package question;

public class lowercasevowels {
    // function for cheking lowercase vowels in an string
    public static int CountVowel(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "what is your name";
        System.out.println(CountVowel(str));
    }
}
