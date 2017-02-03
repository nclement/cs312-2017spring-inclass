/* Program that will draw the output desired from the slides
 */
public class DrawFigures {
    public static void main(String[] args) {
        // Print all the shapes with a blank line between them.
        hexagon();
        System.out.println();
        cup();
        System.out.println();
        stopSign();
        System.out.println();
        cap();
    }

    /**
     * This will print out the top half of a hexagon, the first
     * shape in our program.
     */
    public static void hexagon() {
        /*
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        */
        top();
    }

    /**
     * This will print out the cup-and-saucer, which is the second
     * shape in our program.
     */
    public static void cup() {
        bottom();
        System.out.println("+--------+");
    }

    /**
     * This will print out a STOP sign, which is the third shape in
     * our program.
     */
    public static void stopSign() {
        top();
        System.out.println("|  STOP  |");
        bottom();
    }

    /**
     * This is 
     */
    public static void cap() {
        top();
        System.out.println("+--------+");
    }

    public static void top() {
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
}