import java.util.*;

public class StrMergeSort {
    public static void mergeSort(String arr[], int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        //kam
        int mid = si+(ei-si)/2;
        // inner fuction call for left part
        mergeSort(arr, si, mid);

        //inner function call for right part
        mergeSort(arr, mid+1, ei);

        // calling merge function
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        // temp array
        String temp[] = new String[ei-si+1];

        int i = si;// for left array iteration
        int j=mid+1;// for right array iteration
        int k=0;// for temp array iteration

        // loop for sorting left array and right array
        while(i<=mid && j<=ei){
             
            if(arr[i].compareTo(arr[j])>=0){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // remaining left array element
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        // remaining right array element
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        // copping tmep to arr
        for(k=0 ,i=si; k<temp.length; k++,i++){
            temp[k]=arr[i];
        }
    }
    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
       String arr[] = {"sun"};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
