public class MaxRegion {
    static int row, col,count;

    public static boolean isSafe(int grid[][], int i , int j, boolean vis[][]){

        if((i>= 0 && j>= 0) && (i<row && j<col) && grid[i][j] == 1 && !vis[i][j]){
            return true;
        }

        return false;
    }

    public static void DFS(int grid[][], int row ,int col, boolean vis[][]){

        vis[row][col] = true;

        int rowNb[] = {0,-1,-1,-1,0,1,1,1};
        int colNb[] = {-1,-1,0,1,1,1,0,-1};

        for(int i=0; i<8; i++){
            if(isSafe(grid,row + rowNb[i], col+colNb[i], vis)){
                count++;
                DFS(grid, row + rowNb[i], col + colNb[i], vis);
            }
        }
    }

    public static int maxRegion(int grid[][]){
        boolean vis[][] = new boolean[row][col];

        int result = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if(grid[i][j] == 1 && !vis[i][j]){
                    count = 1;
                    DFS(grid,i,j,vis);
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int grid[][] = { { 0, 0, 1, 1, 0 },
        { 1, 0, 1, 1, 1 },
        { 0, 1, 0, 0, 0 },
        { 0, 0, 0, 0, 1 } };

        row = grid.length;
        col = grid[0].length;

        System.out.println(maxRegion(grid));
        

    }
}
