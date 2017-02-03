
/**
 * Write a description of class Dots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dots
{
    public static void main(String[] args) {
        /*

         ****1
         ***2
         **3
         *4
        5

         */
        // line  NUM  NUM = -1 * line + 5 = 5 - line
        // 1     4    4
        // 2     3    3
        // 3     2
        // 4     1
        // 5     0

        for (int line = 1; line <= 5; line++) {
            // print out 4 stars
            for (int i = 1; i <= 5 - line; i++) {
                System.out.print("*");
            }
            // print out the number
            System.out.print(line);
            for(int i = 1; i <= line - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
