
/**
 * Write a description of class Stars1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars1
{
    public static void main(String[] args) {
         // print 12 stars.
         for (int i = 1; i <= 12; i++) {
             System.out.print("*");
         }
         System.out.println();
         
         // for (each of 5 lines) { 
         for (int i = 1; i <= 5; i++) {
             // print a star
             System.out.print("*");
             // print 10 spaces.
             for (int j = 1; j <= 10; j++) {
                 System.out.print(" ");
             }
             // print a star.
             System.out.println("*");
         }
         for (int i = 1; i <= 12; i++) {
             System.out.print("*");
         }
         System.out.println();
    }
}
