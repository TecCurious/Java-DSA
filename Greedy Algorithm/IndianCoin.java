import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,200};

        Arrays.sort(coin , Comparator.reverseOrder());

        int amount = 590;
        int countOfCoin=0;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coin.length; i++){
            if(coin[i] <= amount){

                while(coin[i] <= amount){
                    countOfCoin++;
                    amount = amount - coin[i];
                    ans.add(coin[i]);
                }
            }
        }
        System.out.println("number of minium coin:"+countOfCoin);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
