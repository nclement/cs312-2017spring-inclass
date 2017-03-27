import java.util.*;

/**
 * Write a description of class Weather here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weather
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Get the number of days
        System.out.print("How many days' temperatures? ");
        int numDays = console.nextInt();
        double totalTemps = 0;
        double[] temps = new double[numDays];
        // What is the value of temps[0]?
        for (int i = 0; i < numDays; i++) {
            System.out.printf("Day %2d's high temp: ", i + 1);
            temps[i] = console.nextDouble();
            totalTemps += temps[i];
        }

        double average = totalTemps / numDays;
        System.out.printf("Average temp = %.2f\n", totalTemps / numDays);

        int count = 0;
        for (int i = 0; i < numDays; i++) {
            if (temps[i] > average) {
                count++;
            }
        }

        // Will sort in-place
        Arrays.sort(temps);
        System.out.println("temps sorted are: " + Arrays.toString(temps));
        System.out.println(count + " days were above average.");
        System.out.println("The two hottest temps were " + temps[temps.length - 1] + 
                        " and " + temps[temps.length - 2]);
        System.out.println("The two coldest temps were " + temps[0] + " and " + temps[1]);
        //System.out.println("The coldest temp was " + ____);
    }

    // For even arrays, returns the 1st middle thing
    // 
    public static int getMidIndex(int length) {
        return (int)(Math.ceil(length / 2.0) - 1);
    }
}
