
/**
 * Write a description of class MTables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MTables
{
    public static void main(String[] args) {
        int N = 5;

        // Nested for-loops
        for (int num = 1; num <= N; num++) {
            // This inner loop will print out the multiplication
            // values for a given num (easy)
            for (int i = 1; i <= N; i++) {
                System.out.print(num * i + " ");
            }
            System.out.println();
        }
    }
}
