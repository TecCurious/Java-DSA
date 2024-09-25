public class StringLength {
    public static int StrLenght(String str, int i,int count){
       
        if(i==str.length()){
            return count;
        }
        return StrLenght(str, i+1, count+1);
    }
    public static void main(String[] args) {
        String s ="prakash kumar";
      System.out.println( StrLenght(s, 0, 0));
      System.out.println(s.length());
    }
}
