import java.util.*;
public class RottOranges {

    public static class Pair{
        int row;
        int col;
        int t;

        public Pair(int row , int col , int t){
            this.row = row;
            this.col = col;
            this.t = t;
        }
    }

    public static int rottOranges(int[][] grid){

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        int fressOr = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else if(grid[i][j] == 1){
                    fressOr++;
                } else {
                    vis[i][j] = 0;
                }
                
            }
        }

        int Drow[] = {0,-1,0,1};
        int Dcol[] = {-1,0,1,0};

        int minTime = 0;
        int ctn = 0; 
        // bfs logic
        while(!q.isEmpty()){
        Pair curr = q.remove();
            int row = curr.row;
            int col = curr.col;
            int t = curr.t;
            minTime = Math.max(minTime, t);

            for(int i=0; i<4; i++){
                int nrow = row + Drow[i];
                int ncol = col + Dcol[i];

                if(nrow >= 0 && ncol >= 0 && nrow <n && ncol < m && grid[nrow][ncol] == 1 && vis[nrow][ncol] != 2){
                    q.add(new Pair(nrow, ncol, t +1));
                    vis[nrow][ncol] = 2;
                    ctn++;
                }
            }
        }

        if(fressOr != ctn){
            return -1;
        }

        return minTime;
    }
    public static void main(String[] args) {
        int grid[][] = {{2,1,0,2,1},
                        {0,1,1,2,1},
                        {0,0,0,2,1}};

        System.out.println(rottOranges(grid));
    }
}
