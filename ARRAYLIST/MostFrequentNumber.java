import java.util.ArrayList;

public class MostFrequentNumber {

    public static int mostFRequent(ArrayList<Integer> nums, int key){

        // a ans array with 1000 si
        int  result[] = new int[1000];
        
        // adding occured numbers count in ans
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int Ans=0;
        // finding mximun number occurence after key
        for(int i=0; i<result.length; i++){
            if(max < result[i]){
                max = result[i];
                Ans = i+1;
            }
        }
    
        return Ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        System.out.println(mostFRequent(nums, 1));
    }
}
