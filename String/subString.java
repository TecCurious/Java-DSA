public class subString {
    public static void substr(String str, int si,int ei){
        String subString ="";
        for(int i=si; i<ei; i++){
            subString +=str.charAt(i);
        }
        System.out.println(subString);
    }
    public static void main(String[] args) {
String string = "Helloworld";
        System.out.println(string.substring(0, 5));
        
    
// substr(string, 0, 5);
    }
}
