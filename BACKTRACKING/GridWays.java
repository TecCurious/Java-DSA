public class GridWays {
    public static int girdWays(int x, int y, int n, int m){

        // base case
        if(x==n-1 || y==m-1){
            return 1;
        }
        else if(x==n || y==m){
            return 0;
        }

        //kam
        // right 
       int w1= girdWays(x, y+1, n, m);
       // down
       int w2 = girdWays(x+1, y, n, m);

       return w1+w2;


    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(girdWays(0, 0, n, m));
    }
}
