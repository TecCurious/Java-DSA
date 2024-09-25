import java.util.Arrays;

public class LongestIncresingPath {
    // recursion
    public static int getPathLength(int mat[][], int i, int j, int n, int m){

        int max = 0;
        if(i == n-1 || j == m-1){
            max = 1;
        }

        
       
       if( i+1 < n  && mat[i][j] < mat[i+1][j]){
        int go = getPathLength(mat, i+1, j, n, m)+1;
        max = Math.max(max , go);
       }

       if(j+1 < m && mat[i][j] < mat[i][j+1]){
        int go = getPathLength(mat, i, j+1, n, m)+1;
         max = Math.max(max, go);
       }

       return max;
    }

    // Memoization
    public static int getPathMem(int mat[][], int n, int m, int i, int j, int dp[][]){

        if(dp[i][j] == -1){
            int max = 0;
            if(i == n-1 &&  j == n-1){ // for the last element of the matrix
                return dp[i][j] = 1;
            }
            if(i == n-1 || j == m-1){
                max = 1;
            }


            // go down
            if(i+1 < n && mat[i][j] < mat[i+1][j]){
                max = Math.max(max, getPathMem(mat, n, m, i+1, j, dp)+1);
            }
            //left
            if(j+1 < m && mat[i][j] < mat[i][j+1]){
                max = Math.max(max, getPathMem(mat, n, m, i, j+1, dp)+1);
            }

            dp[i][j] = max;
        }

        return dp[i][j];
    }
    public static void main(String[] args) {
        int N = 4, M = 4;
        int m[][] = { { 1, 2, 3, 4 },
                    { 2, 2, 3, 4 },
                    { 3, 2, 3, 4 },
                    { 4, 5, 6, 7 } };
        
        int dp[][] = new int[N+1][M+1];

        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(getPathLength(m, 0, 0, N, M));
        System.out.println(getPathMem(m, N, M, 0, 0, dp));

    }
}
