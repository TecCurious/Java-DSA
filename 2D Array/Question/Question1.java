public class Question1 {
    //Print the number of 7’s that are inthe 2d array.
    public static int COuntNUm(int array[][],int key){
        int count =0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(key == array[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int array[][] = {{4,7,8},{8,8,7}};
        System.out.println(COuntNUm(array, 8));
    }
}