import java.util.ArrayList;

public class ContainWaterBrut {
   public static int maxWater(ArrayList<Integer> height){
    int high = 0;
    int maxWater = Integer.MIN_VALUE;
    // brute force approach
    // time (n^2)
    for(int i=0; i<height.size(); i++){
        for(int j=i+1; j<height.size(); j++){
            high = Math.min(height.get(i),height.get(j));
            int width = j-1;
            int water = high*width;
            maxWater = Math.max(maxWater, water);
        }
    }
    return maxWater;
   }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);



        System.out.println(maxWater(height));
    }
}
