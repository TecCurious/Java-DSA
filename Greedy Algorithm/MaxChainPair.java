import java.util.Arrays;
import java.util.Comparator;

public class MaxChainPair {
    public static void main(String[] args) {
        int pair[][] = {{5,24}, {39,60}, {5,28}, {27, 40},{50,90}};

        // sorting by the end of pair
        Arrays.sort(pair , Comparator.comparingDouble(o ->o[1]));

        int chianLen = 1;
        int pairEnd = pair[0][1];

        for(int i=1; i<pair.length; i++){
            if(pair[i][0] > pairEnd){
                chianLen++;
                pairEnd = pair[i][1];
            }
        }
    
        System.out.println("maximum chain length :"+ chianLen);
    }
}
