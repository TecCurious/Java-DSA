import java.util.ArrayList;
import java.util.Collections;
public class LonelyNumberOptimise {
   
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums ){
         Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        //chekking elements lonely or not excluding first element and last element
        for(int i=1; i<nums.size()-1; i++){
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)){
                list.add(nums.get(i));
            }
        }

        // condition foe only  one elemnt in the arrayList
        if(nums.size() ==1){
            list.add(nums.get(0));
        } 

        if(nums.size()>1){
            // for first element
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }

            if(nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(lonelyNum(nums));

    }
}
