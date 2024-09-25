import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("set contains 2");
        }

        if(set.contains(3)){
            System.out.println("set contains 3");
        }

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());



        //  Iteration on  HashSet
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangluru");

        // itrate using Iterator of HashSet
        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // Iterate using advance loop (forEach loop)

        for (String city : cities){
            System.out.println(city);
        }

    }
}
