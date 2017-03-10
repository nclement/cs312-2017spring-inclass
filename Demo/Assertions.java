
/**
 * Write a description of class Assertions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assertions
{
    public static void mystery(int x, int y) { 
        int z = 0;
        // Point A
        while (x >= y) {
            // Point B
            x = x - y;
            z++;
            if (x != y) {
                // Point C
                z = z * 2; 
            }
            // Point D
        }
        // Point E
        System.out.println(z); 
    }
}
