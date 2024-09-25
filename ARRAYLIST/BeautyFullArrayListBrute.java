import java.util.ArrayList;

public class BeautyFullArrayListBrute {

    public static ArrayList<Integer> beausifull(int n){
        // ans arraylist
         ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2; i<=n; i++){
            // temp array for hlding odd or eeven element
            ArrayList<Integer> temp = new ArrayList<>();

            // for odd
            for(Integer e : ans){
                if(e*2-1 <= n){
                    temp.add(e*2-1);
                }
            }
                // for even
                for(Integer e : ans){
                    if(e*2 <= n){
                        temp.add(e*2);
                    }
                }
                // temp value assngning to ans for next iteration
                ans = temp;
        }
        return ans;
       
    }
    public static void main(String[] args) {
      int n = 4;
      System.out.println(beausifull(n));


    }
}
