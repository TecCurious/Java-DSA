public class Q {
    public static void main(String[] args) {
       int arr[] = {3,4,5,1,2};
       int prev = arr[0];
       for(int i=1,j=0; i<arr.length; i++,j++ ){
        arr[(i+1)%arr.length] = prev;
        int curr = arr[j];
        prev = curr;
       }

       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+"");
       }
    }
}
