
/**
 * Write a description of class Fact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fact
{
    public static void main(String[] args) {
        for (int N = 1; N <= 1000; N++) {
            //int N = 2;
            int total = 1;

            /*
            // If N is 3:
            total = 3 * 2 * 1;
            // If N is 4:
            total *= 4;
            // N is 5:
            total *= 5;
            total *= 6;
             */

            for (int i = N; i >= 1; i--) {
                total *= i;
            }

            System.out.println(N + "! is: " + total);
        }
    }
}
