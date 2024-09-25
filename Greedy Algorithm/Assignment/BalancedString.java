public class BalancedString {

    public static int balancedStr(String str){
        int R=0,L=0;
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'R'){
                R++;
            }else{
                L++;
            }

            if(R == L){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(balancedStr(str));
    }
}
