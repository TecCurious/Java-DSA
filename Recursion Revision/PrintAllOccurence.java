public class PrintAllOccurence {
    public static void printOcurrence(int arr[], int key,int idx){
        // base case
        if(idx==arr.length){
            return;
        }
        //kam
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        printOcurrence(arr, key, idx+1);
    }
    public static void main(String[] args) {
    int arr[]={3,2,4,5,6,2,7,2,2};
    printOcurrence(arr, 2, 0);
    }
}
