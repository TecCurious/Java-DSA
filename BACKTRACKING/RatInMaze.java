public class RatInMaze {

    public static boolean ratInMaze(int maze[][],int N, int x, int y){
        int solu[][] = new int[N][N];
        if(ratInMzeUtil(maze,solu,x,y)){
             System.out.println("solution is found");
                printSollution(solu);
            return true;
        }else{
            System.out.println("solution not exist");
        }

        return false;
    }

    public static boolean isSafe(int maze[][], int x, int y){
        int n = maze.length;
        return  (x>=0 && x<n && y>=0 && y<n && maze[x][y]==1);
    }

    public static boolean ratInMzeUtil(int maze[][], int solu[][], int x, int y){
        int n = maze.length;
        // base case
        if(x==n-1 && y==n-1 && maze[x][y]==1){
            solu[x][y] = 1;
            return true;
        }

        // kam
        if(isSafe(maze, x, y)){
            solu[x][y]=1;
                // right
            if(ratInMzeUtil(maze, solu, x, y+1)){
                return true;
            }
            //down
            if(ratInMzeUtil(maze, solu, x+1, y)){
                return true;
            }
            solu[x][y]=0;
        }

        return false;
    }

public static void printSollution(int arr[][]){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };

        int N = maze.length;

           ratInMaze(maze, N, 0, 0);
    }
}
