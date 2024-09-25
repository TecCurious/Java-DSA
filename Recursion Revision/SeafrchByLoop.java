public class SeafrchByLoop {
    public static int search(int arr[], int si, int ei, int target){
        while(si<=ei){
            int mid = si+(si+ei);
            if(arr[mid]==target){
                return mid;
            }

            // l1 
            if(arr[mid]>=arr[si]){
                // case a
                if(target>=arr[si] && target<=arr[mid]){
                    si = si;
                    ei = mid-1;
                }
                else{
                    si=mid+1;
                    ei=ei;
                }
               
            }else{
                if(target>=arr[mid] && target<=arr[ei]){
                    si= mid+1;
                    ei= ei;
                }
                else{
                    si = si;
                    ei = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 5));
    }
}
