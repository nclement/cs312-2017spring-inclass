import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How tall are you (inches)? ");
        int inches = console.nextInt();
        classify(inches);
        
        System.out.println(max2(55, 10));
        
    }
    
    public static int max2(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    
    public static int max3(int x, int y, int z) {
        // if(___)
        // && - AND
        // || - OR
        // >
        // >= 
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
    
    public static void classify(int inches) {
        // short (under 5'3") --> 63
        // medium(5'3" to 5'11") --> 63, 71
        // tall (6' or over)  --> 72
        if (inches < 63) {
            System.out.println("You are short :(");
        } else if (63 <= inches && inches <= 71) {
            System.out.println("You are medium.");
        } else {
            System.out.println("You are tall. Cool.");
        }
    }
}
