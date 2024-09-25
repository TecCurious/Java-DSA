import java.util.*;
public class MaxAreaHistogram {

    public static int maxArea(int height[]){
        Stack<Integer> s = new Stack<>();
       int max = 0;
        int n = height.length;
        int nextSmallLeft[] = new int[n];
        int nextSmallRight[] = new int[n];
        
        // next samller left
        for(int i=0; i<n; i++){
            while(!s.isEmpty() &&  height[s.peek()]>= height[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextSmallLeft[i] = -1;
            }else {
                nextSmallLeft[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        // next samller right
        for(int i=n-1; i>= 0; i-- ){
            while(!s.isEmpty() &&  height[s.peek()] >= height[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextSmallRight[i] = n;
            }else{
                nextSmallRight[i] = s.peek();
            }

            s.push(i);
        }
        

        
        // calculating area 
        for(int i=0; i<n; i++){
            int area = (nextSmallRight[i]-nextSmallLeft[i]-1)*height[i];
            max = Math.max(max, area);
        }

        return max;
    }

public static void main(String[] args) {
    int height[] = {2,4};// height of histogram
    System.out.println(maxArea(height));
}
}