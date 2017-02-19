
/**
 * Write a description of class Params here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Params
{
    public static void main(String[] args) {
        int a = 6;
        int b = 22;

        doThing(a, b);
        doThing(b, a);
        doThing(22, 6);
    }

    public static void doThing(int x, int y) {
        System.out.println("x is " + x + " and y is " + y);
    }
    
    /**
     * Will return the number of parameters that are different
     */
    public static int numDiff(int a, int b, int c) {
        // Return 1
        if (a == b && a == c) {
            return 1;
        }
        // Return 3
        else if (a != b && a != c && b != c) {
            return 3;
        } else {
            return 2;
        }
    }
}
