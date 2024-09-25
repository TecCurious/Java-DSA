 class InversionCountByLoop {
    
    public static int merge(int arr[], int left, int mid, int right){
        int temp[] = new int[right-left+1];
        int invCount =0;
        int i=left;
        int j=mid; 
        int k=0;

        while(i<= mid && j<=right){
            if(arr[i]<= arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                invCount+= (mid-i);
            }
            k++;
            
        }

        if(i<=mid){
            temp[k]=temp[i];
            i++;
            k++;
        }

        if(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }


        for(i=left, k=0; i<right; k++, i++){
            arr[i]=temp[k];
        }
        return invCount;
    }

    public static int  invertionCount(int arr[],int left ,int right){
            int invCount =0;

            if(right>left){
                int mid = left+(right-left)/2;
                invCount+= invertionCount(arr, left, mid);
                invCount+=invertionCount(arr, mid+1, right);
                invCount+= merge(arr, left , mid+1 , right);
            }
            return invCount;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(invertionCount(arr, 0,arr.length));
    }
}