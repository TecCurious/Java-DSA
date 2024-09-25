public class MejorityEleByDC {
    public static int countElement(int arr[], int num, int si, int ei){
         int count = 0;
        for(int i=si; i<=ei; i++){
           
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }

    public static int mejorityElement(int arr[], int si, int ei){
        // base case
        if(si==ei){
            return arr[si];
        }

        int mid = si+(ei-si)/2;
// for left mejority elementr
        int left = mejorityElement(arr, si, mid);
        // for right mejority element
        int right = mejorityElement(arr, mid+1, ei);

        // if(left==right){
        //     return left;
        // }

        int leftCount = countElement(arr, left, si, ei);
        int rightCount = countElement(arr, right , si, ei);

        return leftCount>rightCount ? left:right;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(mejorityElement(arr, 0, arr.length-1));

    }
}
