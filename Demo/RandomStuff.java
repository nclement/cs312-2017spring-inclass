import java.util.*;

/**
 * Write a description of class RandomStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomStuff
{
    public static void main(String[] args) {
        Random rand = new Random();
        double randNum = -1;
        int count = 0;
        while (randNum != 4.0) {
            randNum = rand.nextDouble() * 2.5 + 1.5;
            count++;
            if (count % 10000 == 0) {
                System.out.printf("Generated %d random numbers\n", count);
            }
        }
        System.out.println("Found it in " + count + " steps");
    }
}
