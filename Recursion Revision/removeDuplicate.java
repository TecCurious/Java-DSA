public class removeDuplicate {
    public static String removedp(String str){
        String newString = "";
        for(int i=0; i<str.length(); i++){
            int count =0;
            for(int j=i+1; j<str.length()-1; j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
               newString =  newString+str.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "prakash";
        System.out.println(removedp(str));
    }
}
