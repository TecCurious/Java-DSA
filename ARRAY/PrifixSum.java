public class PrifixSum {
    // print sub array
    public static void PrintSub(int number[]){
        
        int sum=0;
        
          int largest = Integer.MIN_VALUE;
          int prefix[] = new int[number.length];
          prefix[0]=number[0];

          for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+number[i];
          } 
        //   for(int i=1; i<prefix.length; i++){
        //     System.out.println(prefix[i]);
        //   } 

        
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                
                sum = i==0? prefix[j]:prefix[j]-prefix[i-1];
                if(sum>largest){
                    largest = sum;
            
                }
               sum =0;
                
              
            }
           
        }
       System.out.println("max sum of subarrays ="+largest);
       

    }
    public static void main(String args[]){
        int numnber[] = {-2,4,-6,8,10};
        PrintSub(numnber);
    }
}
