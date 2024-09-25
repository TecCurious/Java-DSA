public class LastOccurence {
    public static int lasttoccur(int arr[], int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lasttoccur(arr, key, i+1);
        if(isFound == -1 && key == arr[i]){
            return i;
        }
        return isFound;

       
    }

    public static void main(String[] args) {
        int arr[] = {3,3,2,5,8,5,3,2};
        System.out.println(lasttoccur(arr, 8, 0));
    }
}
