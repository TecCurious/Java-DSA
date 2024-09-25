import java.util.*;
public class ChocolaProblrm {
    public static void main(String[] args) {
        // vrtical cost
        Integer verCost[] = {2,1,3,1,4};
            // horizontal cost
        Integer horiCost[] = {4,1,2};

        // reverse both Array in decending Order

        Arrays.sort(verCost, Comparator.reverseOrder());
        Arrays.sort(horiCost, Comparator.reverseOrder());

        int h =0, v=0;
        int hp =1, vp = 1; // horizontal peace and vertical peace

        int cost =0;

        while(h < horiCost.length && v <verCost.length ){
            if(horiCost[h] <= verCost[v]){
                cost+=(verCost[v]*hp);// vertical cut
                v++;
                vp++;
            }
            else{
                cost += (horiCost[h]*vp);// horizontal cut
                h++;
                hp++;
            }
        }


        // rest vertical lines 
        while(v < verCost.length){
            cost+=(verCost[v]*hp);
                v++;
                vp++;
        }

        // rest horizontal lines
        while( h <horiCost.length){
            cost += (horiCost[h]*vp);
            h++;
            hp++;
        }


        System.out.println("minimal cost of making square pieces of chockalate = "+cost);
    }
}
