
/**
 * Write a description of class SlopeFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlopeFun
{
    public static void main(String[] args) {
        double r = slope(0, 5, 11, 2);
        System.out.println(r);
    }

    public static double slope(int x1, int x2, int y1, int y2) {
        double dy = y2 - y1; 
        double dx = x2 - x1; 
        double result = dy / dx; 
        
        return result;
    }
}
