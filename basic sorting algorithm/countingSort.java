public class countingSort {
    public static void CountSort(int arr[]){
        // step-1 find largest value in array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        // step-2 crating countarray
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // step-3 sorting 
        int j=0; 
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    // function for print array
public static void PrintAaray(int arr[]){
    for( int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
     public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountSort(arr);
        PrintAaray(arr);
    }
}
