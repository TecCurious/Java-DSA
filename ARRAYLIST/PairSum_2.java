import java.util.ArrayList;

public class PairSum_2 {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        // 2 pointer approaxh
        int lp=0;;
        int rp=0;
        int n = list.size();
        // finding break point
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                lp= i+1;
                rp=i;
            }
        }

        // chekking target
        while(lp!=rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            // increament of pointers
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;// x%n  belongs to between n-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
System.out.println(pairSum(list, 16));
    }
}
