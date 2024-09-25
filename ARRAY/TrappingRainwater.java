public class TrappingRainwater {
    public static int Trapping(int height[]){
        int sht =0;
        int count=0;
        int count2=0;
        int tp=0;
        int left =0;
        int right =0;
// if(height.length == 2){
//     return 0;
// }
// for(int i=1; i<height.length; i++){
//     sht = height[0];
//     if(sht <height[i]){
//         sht = height[i];
//         count++;

//     }
//     else if(sht>height[i]){
//         sht=height[i];
//         count2++;
//     }
    
// }
// if(count+1==height.length || count2+1==height.length){
//     return 0;
// }
int j=0;
        for(int i=1; i<height.length-1; i++){
            for( j=0; j<i; j++){
                if(left<height[j])
                left = height[j];
            }
            for(int k=j; k<height.length; k++){
                if(right<height[k]){
                    right =height[k];
                }
            }
            // System.out.println(left+","+right);
            tp +=Math.min(left,right)-height[i];
         right=0;
         left=0;
        }
            return tp;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        // int height[] = {4,2,3};
       System.out.println(Trapping(height)); 
    }
}
