public class HeapSort {


    // heapify fuction
    public static void heapify(int arr[] , int size , int i){
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left <size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right <size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            // swap maxIdx to i
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, size, maxIdx);
        }
    }

    public static void heapSort(int arr[]  ,int size ){
        // build maxheap from minheap
        for(int i=size/2; i>=0; i--){
            heapify(arr,size , i);
        }

        // swap - first last and then heapify - arange heap again
        for(int i=size-1; i>0; i--){
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        heapSort(arr, arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
