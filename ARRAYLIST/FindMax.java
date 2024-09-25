import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);

        int max = Integer.MIN_VALUE;

        // max find

        for(int i=0; i<list.size(); i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }

        // System.out.println(max);


        // swap numbers
        System.out.println("before swap"+ list);
        int id1=2;
        int id2 =3;
        int temp = list.get(id1);
        list.set(id1, list.get(id2));
        list.set(id2,temp);
        System.out.println("after swap"+ list);


    }
}
