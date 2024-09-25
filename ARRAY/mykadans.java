public class mykadans {
    public static int KSubMax(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;
        int count =0;
// chekking all element nigative or positive
        for(int i=0; i<number.length; i++){
            if(number[i]<0){
                count++;
            }
        }

            if(count == number.length){
                for(int i=0; i<number.length; i++){
                    if(number[i]>ms){
                        ms=number[i];
                    }
                }
                return ms;
            }
        
        for(int i=0; i<number.length; i++){
            cs=cs+number[i];

            if(ms<cs){
                ms =cs;
            }
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        // System.out.println("max sum of subarray = "+ms);
        return ms;

    }
    public static void main(String args[]){
        // int number[]={-2,-3,4,-1,-2,1,5,-2};
        // int number[]={-2,-4,-6,-8,-10};
        int number[]={2,4,6,8,10};
        System.out.println(KSubMax(number));
    }
}
