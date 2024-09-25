class FloodFillAlgo {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        int orgCol = image[sr][sc];
        helper(image, sr, sc, color, vis, orgCol);

        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        // base case
        if(sc < 0 || sr < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        image[sr][sc] = color;
        vis[sr][sc] = true;

        // left
        helper(image, sr, sc-1, color,vis,orgCol);
        // right
        helper(image, sr, sc+1, color,vis,orgCol);
        // up
        helper(image, sr-1, sc, color,vis,orgCol);
        // down
        helper(image, sr+1, sc, color,vis,orgCol);
    }
}
