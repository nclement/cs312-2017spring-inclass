
/**
 * Write a description of class Loopy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loopy
{
    public static void main(String[] args) {
        System.out.println("Starting...");
        int N = 100;
        for (int i = 2; i <= N; i *= 2) {
            System.out.println(i);
        }
    }
}
