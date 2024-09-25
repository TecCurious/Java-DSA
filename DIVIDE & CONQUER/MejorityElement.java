public class MejorityElement {

    public static int  mejority(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int count =1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,1,2,2};
        System.out.println(mejority(arr)); 
    }
}
