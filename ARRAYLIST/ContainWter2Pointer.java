import java.util.ArrayList;

public class ContainWter2Pointer {
    public static int maxWater(ArrayList<Integer> height, int lp, int rp){
       
        int maxWater = 0;
        // Two pointer Approach
        while(lp<rp){
            int heig = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int water = heig*width;
            maxWater = Math.max(maxWater, water);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
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

        int lp=0; 
        int rp = height.size()-1;

        System.out.println(maxWater(height, lp, rp));
    }
}
