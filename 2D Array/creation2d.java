import java.util.Scanner;

public class creation2d {
    // function for searching an element in matrix
    public static boolean searching(int Matrix[][],int key){
         for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++){
                if(Matrix[i][j]==key){
                    System.out.println("key is index (" +i+","+j+")");
                    return true;
                }

            }
           
        }
        return false;
    }

    public static void main(String[] args) {
        int Matrix[][] = new int[3][3];
        int n = Matrix.length;
        int m=Matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // taking input element of the matrix 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Matrix[i][j] = sc.nextInt();
            }
           
        }
// matrix printing
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(Matrix[i][j]);
            }
           System.out.println();
        }
        // searching elememnt
        int key = 6;
        System.out.println(searching(Matrix, key));

    }
}