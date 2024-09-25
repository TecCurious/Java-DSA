public class SearchInRotated {
    public static int search(int arr[],int target, int si, int ei){
        // base case
        if(si>ei){
            return -1;
        }
        // kam 
        int mid = si+(ei-si)/2;
        // case found
        if(arr[mid]==target){
            return mid;
        }

        // case 1: l1 mid on l1
        if(arr[si]<=arr[mid]){
            // case a: left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                // case b: right
                return search(arr, target, mid+1, ei);
            }

        }
        // case 2 : l2 mid on l2
        else{
            // case c: right
            if(arr[mid]<=target && target<=arr[ei]){
              return  search(arr, target, mid+1, ei);
            }else{
                // case b: left
                return search(arr, target, si, mid-1);
            }
        }
       
    }
    public static void main(String[] args) {

        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int idx = search(arr, target, 0, arr.length-1);
       System.out.println(idx); 
    }
}
