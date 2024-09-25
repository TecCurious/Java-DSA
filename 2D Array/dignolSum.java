public class dignolSum {
    public static int MatrixDignolSum(int Matrix[][]){ // O(n^2)
        int sum =0;
        // Brut force code
        // for(int i=0; i<Matrix.length; i++){
        //     for(int j=0; j<Matrix[0].length; j++){
        //         // primary dignol sum
        //         if(i==j){
        //             sum+=Matrix[i][j];
        //         }
        //         else if(i+j==Matrix.length-1){
        //             sum+=Matrix[i][j];
        //         }

        //     }
           
        // }

        for(int i=0; i<Matrix.length; i++){
            //pd
            sum+=Matrix[i][i];
            if(i!=Matrix.length-1-i)
            sum+=Matrix[i][Matrix.length-1-i];
        }
         return sum;
    }
    public static void main(String[] args) {
    //     int Matrix[][] = {{1,2,3,4},
    //     {5,6,7,8},
    //     {9,10,11,12},
    //    {13,14,15,16}};
    int Matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};

       System.out.println(MatrixDignolSum(Matrix));
    }
}
