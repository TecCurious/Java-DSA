public class Question2 {
    //Print out the sum of the numbers inthe second row of the “nums” array
    public static void RowSum(int num[][],int  Rownum){
        int sum=0;
        for(int i =0; i<num[0].length; i++){
            sum +=num[Rownum][i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int num[][] = {{1,4,9},{11,4,3},{2,2,3}};
        RowSum(num, 0);
    }
}
