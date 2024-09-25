class MatrixMultplication {
    public static void mMultiplication(int m1[][],int m2[][],int mul[][]) {
        int row;
        int col;

        for( row=0; row<m1.length; row++){
            for(col=0; col<m1[0].length; col++){
                for(int k=0; k<m1[0].length; k++){
                    mul[row][col] += m1[row][k]*m2[k][col];
                }
            }
        }
    }

    public static void main(String[] args) {
        int m1[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int m2[][] = {{1,2,3},{1,2,3},{1,2,3}};

        int mul[][] = new int[3][3];
        mMultiplication(m1, m2, mul);

        // for printing mul
        for(int i=0; i<mul.length; i++){
            for(int j=0; j<mul[0].length; j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
   }
}