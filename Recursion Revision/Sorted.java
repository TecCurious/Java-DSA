public class Sorted {
public static int search(int arr[], int si, int ei,int target){
    // base case
    if(si>ei){
        return -1;
    }
    
    // kam
    int mid = si+(ei-si)/2;
    if(arr[mid]==target){
        return mid;
    }
    // l1
    if(arr[mid]>=arr[si]){
        if(target>=arr[si] && target<=arr[mid]){
           return   search(arr, si, mid-1,target);
        }else{
           return search(arr, mid+1, ei, target);
        }
       
    }
// l2
else{
    if(target >=arr[mid] && target<=arr[ei]){
       return search(arr, mid+1, ei, target);
    }else{
       return search(arr, si, mid-1, target);
    }
    
}


}

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 1));
    }
}
