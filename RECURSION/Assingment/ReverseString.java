public class ReverseString {
public static void strReverse(String str, int idx){
    // base case
    if(idx==str.length()){
        return;
    }
    strReverse(str, idx+1);
    System.out.print(str.charAt(idx));
}

    public static void main(String[] args) {
        String str = "abcd";
        strReverse(str, 0);
    }
}
