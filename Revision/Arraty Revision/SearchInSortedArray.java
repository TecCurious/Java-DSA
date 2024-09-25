public class SearchInSortedArray {

    public static int searchRoted(int arr[] , int target){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            int mid = (si+ei)/2;

            if(arr[mid] == target){
                return mid;
            }
            //l1
            if(arr[mid] >= arr[si]){
                //case a:
                if(arr[mid] >= target && target>= arr[si]){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }else{//line 2

                if(arr[mid] <= target && target <= arr[ei]){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};

        System.out.println(searchRoted(arr, 3));
    }
}