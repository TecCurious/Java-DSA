public class insertionSort {
    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            // holding selected element value
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // smallest item putting int the last
            arr[prev+1]=curr;
        }
    }

// time complexity O(n*n) 

// function for print array
public static void PrintAaray(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}


     public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        PrintAaray(arr);
        
    }
}
