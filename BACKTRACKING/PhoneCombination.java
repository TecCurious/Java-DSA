public class PhoneCombination {
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
    {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
    {'t','u','v'},{'w','x','y','z'}};
    public static void letterCombinations(String D) {
    int len = D.length();
    if (len == 0) {
    System.out.println("");
    return;
    }
    bfs(0, len, "", D);
    }
    public static void bfs(int pos, int len, String str, String D) {
    if (pos == len){
    System.out.println(str);
    
    }
    else {
    char[] letters = L[Character.getNumericValue(D.charAt(pos))];
    for (int i = 0; i < letters.length; i++)
    bfs(pos+1, len, str+letters[i], D);
    }
    }
    public static void main(String args[]){
    letterCombinations("23");
    }
    }