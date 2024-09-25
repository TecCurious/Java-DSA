import java.util.ArrayList;

public class MUlriDimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr2.add(3);
        arr2.add(6);
        arr2.add(9);
        arr2.add(12);
        arr2.add(15);

        mainList.add(arr);
        mainList.add(arr2);
        // System.out.println(mainList);


        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


    }
}
