
/**
 * Write a description of class OfficeHours here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OfficeHours
{
    public static void main(String[] args) {
        
        String message = "this is a simple example"
        for (int row = 0; row < 2; row ++){
            for (int i = 0; i < 12; i++) {
                System.out.printf("%3d", i*5+row);
            }
            System.out.println();
        }
    }
}
