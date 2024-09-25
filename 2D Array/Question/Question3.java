public class Question3 {

     // function for print matrix
    public static void PrintMatrix(int transpose[][]){
        for(int i=0; i<transpose.length; i++){
            for(int j=0; i<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    //tranpose of matrix
    public static void TrnaposeOfMatrix(int matrix[][]){
        int row=2, col =3;
        int transpose[][] = new   int[col][row];
        for(int i=0; i<row; i++){
            
            for(int j=0; i<col; j++){
                 
                 transpose[j][i]= matrix[i][j];

            }
        }
        PrintMatrix(transpose);
    }
   
    public static void main(String[] args) {
        int materix[][] = {{2,7,8},{8,8,7}};
        TrnaposeOfMatrix(materix);
      

    }
}
