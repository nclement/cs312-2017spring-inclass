import java.util.Arrays;

/**
 * Write a description of class Arrays2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrays2D
{
    public static void main(String[] args) {
        int[][] mat = new int[10][3];
        mat[5][1] = 15;

        printByRow(mat);
        printByCol(mat);
    }

    public static void printByRow(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%2d: ", i);
            //System.out.println(Arrays.toString(mat[i]));

            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%3d, ", mat[i][j]);
            }
            // Blank line at the end.
            System.out.println();

        }
    }

    /**
     * Will print out the matrix in "column-major order",
     * the output will be the "transpose" of printByRow
     */
    public static void printByCol(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            printColNum(mat, i);
        }
    }

    /**
     * Function to print out a single column of the matrix, the column
     * number being specified by c.
     */
    public static void printColNum(int[][] mat, int c) {
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%3d ", mat[i][c]);
        }
        System.out.println();
    }

    public static int sumColNum(int[][] mat, int c) {
        int total = 0;
        for (int i = 0; i < mat.length; i++) {
            total += mat[i][c];
        }
        return total;
    }
}
