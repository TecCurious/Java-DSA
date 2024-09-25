import java.util.Comparator;
import java.util.PriorityQueue;

public class HalfArray {

    public static int minOps(int nums[]){
         double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            pq.add((double)nums[i]);
        }
        double temp = sum;
        int ctn = 0;;
        while(temp > sum/2){
        double x = pq.peek();
        pq.remove();
        temp -=  x/ 2;
        pq.add(x/2); 
      ctn++;
    }
    return ctn;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,3,9,10,2};
        System.out.println(minOps(arr));
    }
}
