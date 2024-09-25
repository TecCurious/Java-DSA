public class InversionCountByLoop {
    public static int invertionCount(int arr[]){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {5,5,5};
        System.out.println(invertionCount(arr));
    }
}
