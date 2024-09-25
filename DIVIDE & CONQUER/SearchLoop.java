public class SearchLoop {
    public static int search(int arr[], int target , int si , int ei){
        for(int i=0; i<arr.length; i++){
            int mid = si+(ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            // mid on l1
            if(arr[si]<=arr[mid]){
                // case a: left 
                if(arr[si]<= target && target<=target){
                    ei = mid-1;
                }
                else{
                    // case b: right
                    si= mid+1;
                }
                // mid on l2
            }else{
                // case c: right
                if(arr[mid]>=target && target<arr[ei]){
                    si = mid+1;
                }
                else{
                    // case c: left 
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
        int idx = search(arr, target, 0, arr.length-1);
       System.out.println(idx); 
    }
}
