public class FirstOccurence {
    public static int firstoccur(int arr[], int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }

        return firstoccur(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3,3,2,6,8,5,3,2,5};
        System.out.println(firstoccur(arr, 5, 0));
    }
}
