public class SelectionSort {
    public static void SortArray(int arr[]){
      
        for(int i=0; i<arr.length-2; i++){
           int minpose =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpose]>arr[j]){
                    minpose=j;
                }

            }
            int temp=arr[minpose];
            arr[minpose]=arr[i];
            arr[i]=temp;
        }
    }

    public static void PrintAaray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

public static void main(String[] args) {
    int arr[] ={4,3,5,6};
    SortArray(arr);
    PrintAaray(arr);
    
}
}
