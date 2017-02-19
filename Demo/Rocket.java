
/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket
{
    public static final int SIZE = 5;

    public static void main(String[] args) {
        pointingUp();
        mid();
        pointingUp();
    }

    public static void pointingUp() {
        // 5 lines
        for (int i = 1; i <= SIZE * 2 - 1; i++) {
            // One space to start.
            System.out.print(" ");
            // Spaces
            for (int j = 1; j <= SIZE * 2 - 1 - i; j++) {
                System.out.print(" ");
            }
            // forward slashes
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
            }
            // Stars
            System.out.print("**");
            // Backward slashes
            for (int j = 1; j <= i; j++) {
                System.out.print("\\");
            }
            // Newline
            System.out.println();
        }
    }

    public static void mid() {
        bar();

        upTriangles();
        downTriangles();

        bar();

        downTriangles();
        upTriangles();

        bar();
    }

    public static void bar() {
        // Starting +
        System.out.print("+");
        // =* repeated
        for (int i = 1; i <= SIZE * 2; i++) {
            System.out.print("=*");
        }
        // Final +
        System.out.println("+");
    }

    public static void downTriangles() {
        // 3 rows
        for (int i = 1; i <= SIZE; i++) {
            // Starts with a bar
            System.out.print("|");
            // Do this twice.
            for (int repeat = 1; repeat <= 2; repeat++) {
                // Starting dots
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(".");
                }
                // down pointing
                for (int j = 1; j <= SIZE - i + 1; j++) {
                    System.out.print("\\/");
                }
                // Dots
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(".");
                }
            }
            // New line with a bar
            System.out.println("|");
        }
    }

    public static void upTriangles() {
        // 3 rows
        for (int i = 1; i <= SIZE; i++) {
            // Starts with a bar
            System.out.print("|");
            // Do this twice.
            for (int repeat = 1; repeat <= 2; repeat++) {
                // Starting dots
                for (int j = 1; j <= SIZE - i; j++) {
                    System.out.print(".");
                }
                // Forward slashes
                for (int j = 1; j <= i; j++) {
                    System.out.print("/\\");
                }
                // Dots
                for (int j = 1; j <= SIZE - i; j++) {
                    System.out.print(".");
                }
            }
            // New line with a bar
            System.out.println("|");
        }
    }
}
