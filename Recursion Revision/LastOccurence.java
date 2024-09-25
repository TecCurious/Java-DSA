public class LastOccurence {
    public static int lastOccure(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }

        int isFound =  lastOccure(arr, key, i+1);

        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4,5};
        
        System.out.println(lastOccure(arr, 4, 0));
    }
}
