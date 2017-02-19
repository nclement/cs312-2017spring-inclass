
/**
 * Write a description of class Conditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conditionals
{
    public static void main(String[] args) {
        clicker1();
        max(5, 3);
    }

    /**
     * Returns the sum of all numbers from 0..N
     * 
     * @param N the number to sum up to
     */
    public static int sum(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    /**
     * Returns the product of all numbers from 1..N
     * 
     * This is almost the same as the sum function.
     * 
     * @param N the number to "product" up to
     * @return the product of all numbers 1..N
     */
    public static int product(int N) {
        int sum = 1;
        for (int i = 1; i <= N; i++) {
            sum *= i;
        }
        return sum;
    }
    
    /**
     * Prints out the average of all numbers from 0..N
     * 
     * 8 wide, with 1 decimal place.
     */
    public static void avg(int N) {
        
    }
    
    public static int max(int a, int b) { 
        if (a > b) {
            System.out.println("a is " + a + " and b is " + b);
            System.out.printf("a is %d and b is %d\n", a, b);
            return a;
        } else {
            return b;
        }
        // Can I ever get here?
        //return b;
    }

    public static void clicker1() {
        int a = 6;
        if (a < 6) {
            a = a + 1;
            System.out.println("a incremented."); 
        }
        else if (a > 6) {
            System.out.println("a is too high."); 
        }
        else {
            System.out.println("a is correctly set.");
        }
    }
}
