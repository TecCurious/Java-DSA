public class BinaryS {
    public static int binarySearch(int number[],int key){
        int start = 0;
        int end = number.length-1;
        
        while(start <=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            if(number[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // shorted array
        int number[] = {2,4,6,8,10,12,14};
        System.out.println("key is on index :"+ binarySearch(number, 0));
    }
}
