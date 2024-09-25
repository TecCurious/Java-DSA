import java.util.*;
public class PrintPair{

    public static int printPair(int arr[], int i, int n){
        if( i == n-1){
            return 0;
        }
        
        int add = printPair(arr, i+1, n) +1;
        int notAdd = printPair(arr,  i+1, n);
       
        return add + notAdd ;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(printPair(arr, 0, arr.length));
    }
}