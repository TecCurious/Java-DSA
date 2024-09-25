package question;

public class interMethod {
    public static void intr(String atr1,String str2){

    }
    public static void main(String[] args) {
        String str1="ram";
        String str2="arm";
        str1.intern();
        str2.intern();
        System.out.println(str1==str2);
        
    }
}
