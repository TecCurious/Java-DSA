import java.util.*;
public class FirstNonReapintingchar {
    public static void nonRapitingChar(String str){
            Queue<Character> q = new LinkedList<>();
            int map[] = new int[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map[ch - 'a']++;
            q.add(ch);
            while(!q.isEmpty() && map[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(q.peek()+" ");
            }


        }

    }
    public static void main(String[] args) {
        String str = "aabccxb";
        nonRapitingChar(str);
    }
}
