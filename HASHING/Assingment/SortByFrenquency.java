import java.util.*;
public class SortByFrenquency {

    public static StringBuilder sortByFre(String str){
        HashMap<Character , Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq =new PriorityQueue<>((a,b)->a.getValue() == b.getValue()? a.getKey() - b.getKey() : b.getValue() - a.getValue());

            for(int i=0; i<str.length(); i++){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i) , 0)+1);
            }
        for(Map.Entry<Character , Integer> val : map.entrySet()) {
            pq.add(val);
        }

        StringBuilder newstr = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.remove().getKey();
            int val = map.get(ch);

            while (val > 0) {
                newstr.append(ch);
                val--;
            }

        }

        return newstr;

        
    }
    public static void main(String[] args) {
        String str = "tree";

        System.out.println(sortByFre(str));

    }
}
