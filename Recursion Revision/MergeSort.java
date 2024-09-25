 class MergeSort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        // base case 
        if(si>=ei){
            return;
        }
        //kam
        int mid = si+(ei-si)/2;
        //sort left part
        mergeSort(arr, si, mid);
        //sort right part
        mergeSort(arr, mid+1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[],int si, int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si;// index for first sorted array
        int j = mid+1;//index fo second sorted array 
        int k =0;//index for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }


        // for leftover element  first sorted array
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //for leftover element second sorted array 
        while(j<=ei){
            temp[k++]=arr[j++];

        }


        // for copping temp element to arr 
        for(k=0,i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5};
       mergeSort(arr, 0, arr.length-1);
       printArray(arr);
    }
 }