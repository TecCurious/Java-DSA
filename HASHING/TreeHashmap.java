import java.util.*;
public class TreeHashmap {
    public static void main(String[] args) {
        Map<Integer , Integer> tm = new TreeMap<>();
       
        tm.put(1, 10);
        tm.put(2, 1);
        tm.put(3, 100);
        tm.put(4, 30);

        System.out.println(tm);

    }
}
