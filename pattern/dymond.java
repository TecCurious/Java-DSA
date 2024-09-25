public class dymond {
    public static void main(String args[]){
        int n=7;
        int i,j,k;
        // upper part
        for( i=1; i<=n; i++){
            for( j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=(i+i)-1; k++){
                System.out.print("*");
                // System.out.print(" ");
            }
            System.out.println();
        }

        // lowe part
        for( i=n; i>=1; i--){
            for( j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=(i+i)-1; k++){
                System.out.print("*");
                // System.out.print(" ");
            }
            System.out.println();
        }

    }
}
