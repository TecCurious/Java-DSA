public class subArray {
    // print sub array
    public static void PrintSub(int number[]){
        int ts = 0;
        int sum=0;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                for(int k=i; k<=j; k++ ){
                    System.out.print(number[k]+ " ");
                }
                 ts++;
                System.out.println();
               
            }
            System.out.println();
        }
        System.out.println("total sub arrays "+ts);

    }
    public static void main(String args[]){
        int numnber[] = {2,4,6,8,10};
        PrintSub(numnber);
    }
}
