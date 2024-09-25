public class DeBubbleSort {
    // sort array function
    public static void SortArray(int arr[]){
        for(int term=0; term<arr.length-1; term++){
            boolean isSorted = false;
            for(int j=0; j<arr.length-1-term; j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted = true;

                }
                if(isSorted == true){
                    break;
                }
            }
        }
    }
    // function for prnt array

    public static void PrintAaray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]= {3,5,2,6,2,6};
        SortArray(arr);
        PrintAaray(arr);
    }
}