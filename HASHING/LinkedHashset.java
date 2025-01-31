import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
         HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangluru");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
       lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangluru");
        lhs.add(null);

        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
