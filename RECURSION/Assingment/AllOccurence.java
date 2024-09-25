public class AllOccurence {
    public static void allOccure(int arr[],int key ,int i){
        if(i==arr.length){
            return;
        }
        if(key==arr[i]){
            System.out.println(i);
        }

        allOccure(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2};
        allOccure(arr, 2, 0);
    }
}
