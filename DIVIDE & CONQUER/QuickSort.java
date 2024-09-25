public class QuickSort {
    public static void quickSort(int arr[],int si , int ei){
        // base case
        if(si>=ei){
            return;
        }
        //kam
       int idx = partition(arr,si,ei);
       quickSort(arr, si, idx-1);// left
       quickSort(arr, idx+1, ei );//right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
    
       for(int j=si; j<ei; j++){
        if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }

       }
       i++;
       int temp = pivot;
       arr[ei]=arr[i];
       arr[i]=temp;
       return i;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {-3,6,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
