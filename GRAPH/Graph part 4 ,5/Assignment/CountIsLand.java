public class CountIsLand {

    public static void dfs(int arr[][],boolean vis[][], int r,int c, int n, int m){
        if(r < 0 || c < 0 || r >= n || c >= m || vis[r][c] == true|| arr[r][c] == 0  ){
            return;
        }

        vis[r][c] = true;

        // foure sides
        dfs(arr, vis, r, c-1, m, n);
        dfs(arr, vis, r, c+1, m, n);
        dfs(arr, vis, r-1, c, m, n);
        dfs(arr, vis, r+1, c, m, n);

    }


    public static int isLand(int arr[][], int N, int M){

        boolean vis[][] = new boolean[N][M];
        // making coner 1 vis
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i == 0 || j == 0 || i == N-1 || j == M-1){
                    if(!vis[i][j]){
                        dfs(arr, vis, i, j, N, M);
                    }
                  
                }
            }
        }

        // count lands of connectes 1 sorrounded by 0
            int isLand = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 1 && !vis[i][j]){
                    isLand++;
                    dfs(arr, vis, i, j, N, M);
                }
            }
        }

        return isLand;


    }
    public static void main(String[] args) {
        int N = 5, M = 8;
        int mat[][] = {{0, 0, 0, 0, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1, 0, 0, 1},
                        {0, 1, 0, 1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1}};

        System.out.println(isLand(mat, N, M));
    }
}
