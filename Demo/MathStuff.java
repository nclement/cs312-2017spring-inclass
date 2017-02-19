
/**
 * Write a description of class MathStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MathStuff
{
    public static void main(String[] args) {
        Math.min(16, 200);
        
        int age = -2;
        
        // Should this be min or max?
        age = Math.max(0, age);
        
        for (int i = 0; i != age; i++) {
            System.out.println("Happy birthday!");
        }
    }
}
