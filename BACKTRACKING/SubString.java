public class SubString {
    public static void subString(String str, String ans, int i){
        // base case 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // kam , recursion
        // yes choise 
        subString(str, ans+str.charAt(i), i+1);
        // no choise 
        subString(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str ="abc";
        subString(str, "", 0);
    }
}
