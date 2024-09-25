import java.util.Arrays;

public class MountainArray {

    public static int minimumMountainRemovals(int[] nums) {
        int n = nums.length;

        int dpi[] = new int[n];
        Arrays.fill(dpi, 1);
        for(int i=1; i<n; i++){
            for(int prev=0; prev<i; prev++){
                if(nums[i] > nums[prev]){
                    dpi[i] = Math.max(dpi[i], dpi[prev] + 1);  
            }
            
        }
      
    }


        printArr(dpi);
        int dpd[] = new int[n];
         Arrays.fill(dpd, 1);
        for(int i=1; i< n; i++){
            for(int prev=0; prev<i; prev++){
                if(nums[prev] > nums[i]){
                    dpd[i] = Math.max(dpd[i], dpd[prev] + 1);
                }
                
            }
        }

        printArr(dpd);
        int max = 0;
        // for remove to overlapping ellemts
        for(int i=0; i<n; i++){
            max = Math.max(max, (dpi[i] + dpd[i]) -1);
        }
        return n - max;
    }

    public static void printArr(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1,1,2,3,1};

       System.out.println( minimumMountainRemovals(arr));
    }
}
