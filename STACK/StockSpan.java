import java.util.*;
public class StockSpan {

    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
            span[0] = 1;
            s.push(0);

            for(int i=1; i<stock.length; i++){

                int currStock = stock[i];
                while(!s.isEmpty()  && currStock >= stock[s.peek()]){
                    s.pop();
                }

                if(s.empty()){
                    span[i] = i+1;

                }else{
                    int prevHight = s.peek();
                    span[i] = i - prevHight;
                }
                s.push(i);
            }
        }
    public static void main(String[] args) {
        
        int stock[] = {90,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        stockSpan(stock , span);

        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
