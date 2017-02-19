
/**
 * Write a description of class Tricky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tricky
{
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        String s = m2(x, y) + " " + x +
            " " + m(y, x);
        System.out.print(s);       
    }

    public static int m(int x, int y) { 
        x += 2;
        System.out.print(x + " "); 
        y -= 2;
        return x * y;
    }
    
    public static void m2(int x, int y) {
        x += 2;
        System.out.print(x + " "); 
        y -= 2;
    }
}
