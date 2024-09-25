public class firstrOccurence {
    public static int firsrOccure(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }


        return firsrOccure(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4,5};
        System.out.println(firsrOccure(arr, 4, 0));
    }
}
