import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);


        System.out.println(list);
        // ascending order
        Collections.sort(list);
        System.out.println(list);
        //descendong order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        
    }
}
