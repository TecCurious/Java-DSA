public class OptimalTrapingRainWater {
    public static int trapedRainWater(int height[]){
        int n = height.length;
        int l=0 , r = n-1;
        int lmax = height[0], rmax = height[n-1];
        int res = 0;
         // two pointer approach

         while(l < r){
            if(height[l] < height[r]){
                l++;
                lmax = Math.max(lmax, height[l]);
                res += lmax-height[l];
            }else{
                r--;
                rmax = Math.max(rmax, height[r]);
                res += rmax- height[r];
            }
         }

         return res;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trapedRainWater(height));
    }
}
