public class Trainwater {
public static void trapedWater(int height[]){
    int n=height.length;
    // array for left max boundry value
    int Leftmax[] =new int[n];
     Leftmax[0]=height[0];
    for(int i=1; i<n; i++){
       Leftmax[i] = Math.max(height[i], Leftmax[i-1]);
        
    }
   // array for right max boundry value
   int Rightmax[] = new int[n];
   Rightmax[n-1]=height[n-1];
   for(int i=n-2; i>=0; i--){
    Rightmax[i]=Math.max(height[i], Rightmax[i+1]);
   }
   for(int i=0; i<n; i++){
    System.out.println(Leftmax[i]);
   }

   // calculating traped rain water
   int waterLevel =0;
   int trapedWater =0;
   for(int i=0; i<n; i++){
    waterLevel = Math.min(Leftmax[i], Rightmax[i]);
    trapedWater += waterLevel-height[i];
    
   }
   System.out.println(trapedWater);

}
    public static void main(String args[]){
        // int height[] = {4,2,0,6,3,2,5};
        int height[]={7,0,4,2,5,0,6,4,0,5};
        trapedWater(height);
    }
    
}
