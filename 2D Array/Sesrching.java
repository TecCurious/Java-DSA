import java.util.Scanner;

public class Sesrching {
    // function for searching max number in Matrix
    public static int SearchMAx(int matrix[][]) {
        int Maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (Maxvalue < matrix[i][j]) {
                    Maxvalue = matrix[i][j];
                }
            }
        }
        return Maxvalue;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // taking input element of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        SearchMAx(matrix);
    }
}
