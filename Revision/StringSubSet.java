public class StringSubSet {

    public static void subSet(String str , String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                 System.out.println(ans);
            }
           
            return;
        }

        // recursion
        // choise yes
        subSet(str, ans+str.charAt(i), i+1);

        // choise no
        subSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSet(str, "", 0);
    }
}
