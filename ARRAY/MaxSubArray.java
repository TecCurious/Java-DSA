public class MaxSubArray {
    // print sub array
    public static void PrintSub(int number[]){
        
        int sum=0;
        
          int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                for(int k=i; k<=j; k++ ){
                    sum = sum + number[k];
                }
                System.out.println(sum);
                if(sum>largest){
                    largest = sum;
            
                }
                if(sum<smallest){
                    smallest = sum;
                }
                
               sum = 0;
            }
           
        }
       System.out.println("max sum of subarrays ="+largest);
       System.out.println("min sum of subarrays ="+smallest);

    }
    public static void main(String args[]){
        int numnber[] = {2,4,6,8,};
        PrintSub(numnber);
    }
}
