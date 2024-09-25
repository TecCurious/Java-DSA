package Assignment;

public class SortArrayOfString {
    public static void mergeSort(String arr[], int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        //kam
        int mid = si+(ei-si)/2;

        // for left
        mergeSort(arr, si, mid);
        // for right 
        mergeSort(arr, mid+1, ei);

        // foe merge
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;// index for first sorted array 
        int j=mid+1;// index foe second sorted array 
        int k=0;// index for temparray array

        while(i<=mid && j<=ei){
            int comp = arr[i].compareTo(arr[j]);
            if(comp<0){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // for leftover element first sorted array 
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        // for leftover elemnt second sorted array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
// for coping temp to arr
for(k=0,i=si; k<temp.length; k++,i++){
    arr[i]=temp[k];
}

    }

    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String[] args) {
    String arr[] = {"sum","earth","marse","mercury"};
   mergeSort(arr, 0, arr.length-1);
   printArray(arr);

}
}
