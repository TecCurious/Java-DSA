public class buterfly {
    public static void main(String args[]) {
        // upper part
        int n = 4;
        int i, j, k, l;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (k = 1; k <= 2 * (n -i); k++) {
                System.out.print(" ");
            }
            for (l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
