import java.util.*;
public class SubArraySumKLngth {

    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = -10;
        int sum = 0;
        int maxlen = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];

            // if(sum == k){
            //     maxlen = Math.max(maxlen, j+1);
            // }

            if(map.containsKey(sum-k)){
                maxlen = Math.max(maxlen, j-map.get(sum-k));
            }

            // if(!map.containsKey(sum)){
                map.put(sum, j);
            // }
        }

        System.out.println(maxlen);
    }
}