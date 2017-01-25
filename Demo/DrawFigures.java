/* Program that will draw the output desired from the slides
 */
public class DrawFigures {
    public static void main(String[] args) {
        hexagon();
        System.out.println();
        cup();
        System.out.println();
        stopSign();
        System.out.println();
        cap();
    }

    public static void hexagon() {
        top();
    }

    public static void cup() {
        bottom();
        System.out.println("+--------+");
    }

    public static void stopSign() {
        top();
        System.out.println("|  STOP  |");
        bottom();
    }

    public static void cap() {
        top();
        System.out.println("+--------+");
    }

    public static void top() {
        System.out.println("  ++++++");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
}