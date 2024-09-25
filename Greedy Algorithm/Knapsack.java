import java.util.*;

public class Knapsack {


    public static void main(String[] args) {
        
        int value[] = {60,100, 120};
        int weight[] = {10,20,30};

        int w = 50;

        // 2d array which is hold the index and ration
        double ratio[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        // sorting in accending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int maxValue =0;
        //loop fo getting value in decending order
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){// add full item
               maxValue += value[idx];
                capacity -= weight[idx];
            }else{
                maxValue+= ratio[i][1]*capacity;// add fractional item
                break;
            }
        }
        System.out.println("ans is "+maxValue);
    }
}
