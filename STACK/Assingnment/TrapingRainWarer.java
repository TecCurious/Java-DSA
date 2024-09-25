import java.util.*;
public class TrapingRainWarer {

    public static int rainwater(int height[]){
        Stack<Integer> s = new Stack<>();
        int ans=0;
        // trevesing all heigt element
        for(int i=0; i<height.length; i++){
            while(!s.empty() && height[s.peek()] <= height[i]){
                // current height
                int curr = height[s.peek()];
                s.pop();
                int rmax = i;
                if(s.isEmpty()){
                    break;
                }
                int lmax = s.peek();

                int width = rmax-lmax-1;
                int min_height = Math.min(height[lmax],height[rmax] )-curr;

                ans += min_height*width;

            }
            s.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 7,0,4,2,5,0,6,4,0,5};
        System.out.println(rainwater(arr));

    }
}
