import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        //put Value

        hm.put("India" , 150);
        hm.put("Us", 100);
        hm.put("China", 140);
        hm.put("Rusia", 100);
        hm.put("Bhutan", 60);

        // get value
        // int value = hm.get("India");
        // System.out.println(value);

        // contains Key or not

        // System.out.println(hm.containsKey("China"));
        // System.out.println(hm.containsKey("Indonesia"));

        // remove from HashMap
        // hm.remove("China");
        // System.out.println(hm);
        // size of HashMap
        // System.out.println(hm.size());

        // empty or not HashMap
        System.out.println(hm.isEmpty());

        // remove all emlements from HashMap
        // hm.clear();

        // System.out.println(hm);

        // Iteratiion on HashMap
        Set<String> keys = hm.keySet();

        for (String k : keys){
            System.out.println("key = "+k+","+"value = "+hm.get(k));
        }


    }
}