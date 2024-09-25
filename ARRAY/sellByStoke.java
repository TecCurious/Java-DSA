public class sellByStoke {
    public static int stokeSellBy(int price[]){
        int byingPrice = Integer.MAX_VALUE;
        int sellingPrice = 0;
        int maxprofit =0;
        for(int i=0; i<price.length; i++){
            if(byingPrice<price[i]){
                int profit = price[i]-byingPrice;
                 maxprofit = Math.max(maxprofit, profit);
            }
            else{
                byingPrice=price[i];
            }
        }
        if(maxprofit<0){
            return 0;
        }
        return maxprofit;
    }
    public static void main(String args []){ 
        int price[] = {7,1,5,3,6,4};
       System.out.println(stokeSellBy(price)); 
    }
}
