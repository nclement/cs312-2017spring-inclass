import java.util.Scanner;

/**
 * Write a description of class ExamPrep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExamPrep
{    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many times do you want to play? ");
        int numTimes = keyboard.nextInt(); // 20|_|\n
        keyboard.nextLine();  // 20\n|_|
        System.out.print("And what is your name? ");
        String name = keyboard.nextLine();
        
        System.out.printf("You are %s and you want %d rounds\n", name, numTimes);
        
        
        int i = 6;
        double d = 15.0;
        int x2 = i / i;
        int x3 = (int)(i / d);

        int times = 6;
        double avg = avgMultiples(7, times);
        // avg of ___ multiples is __.___
        System.out.printf("avg of %3d multiples is: %6.0f", times, avg);
        System.out.printf("avg of %3d mulitples is: %6.3f\n", 10, avgMultiples(15, 10));
        System.out.println("avg of 6 mulitples is: " + avg);
        System.out.println("avg of 0 mulitples is: " + avgMultiples(15, 0));
    }

    /**
     * Write a function that is like printMultiples, but returns
     * the average of the multiples.
     * 
     * So avgMultiples(8, 3) will return (8 + 16 + 24) / 3
     */
    public static double avgMultiples(int base, int howMany) {
        double total = 0;
        for (int i = 1; i <= howMany; i++) {
            total += base * i;
        }
        return total / howMany;
    }
}
