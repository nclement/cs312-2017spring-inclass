
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
}
