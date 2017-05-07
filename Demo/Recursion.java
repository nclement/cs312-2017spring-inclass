
/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main(String[] args) {
        printStars(10);
    }
    
    /**
     * Prints n stars, using recursion.
     */
    public static void printStars(int n) {
        if (n == 0) {
            System.out.println("");
        } else {
            System.out.print("*");
            printStars(n - 1);
        }
    }
}
