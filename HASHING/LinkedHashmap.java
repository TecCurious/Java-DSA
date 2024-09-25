import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();// print in same order as input given

        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("Us",50);

        System.out.println(lhm);

        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Us",50);
        System.out.println(hm);


    }
}
