import java.util.Arrays;
import java.util.Comparator;

import javax.sound.sampled.ReverbType;

public class Lambda {



    public static void main(String[] args) {
        
 int start[] = {1, 3 ,2 ,5};
        int end[]  = {2, 4, 3 ,6};


        // if end time array is note sorted

        int activity[][] = new int[end.length][3];

        for(int i=0; i<end.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        for(int i=0; i<end.length; i++){
            System.out.print(activity[i][1]+" ");
        
        }
        System.out.println();

        for(int i=0; i<end.length; i++){
            System.out.print(activity[i][2]+" ");
        
        }

    }
}
