class BackArray {
public static void backtracking(int arr[],int i){
    // base case
    if(i==arr.length){
        printArray(arr);
        return;
    }

    // kam
    arr[i]=i+1;
    backtracking(arr, i+1);
// backtracking
    arr[i]=arr[i]-2;
}

public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[]=new int[5];
        backtracking(arr, 0);
        printArray(arr);
    }
}
