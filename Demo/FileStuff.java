import java.io.*;
import java.util.*;

/**
 * Write a description of class FileStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileStuff
{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Working Directory = " + 
            System.getProperty("user.dir"));
        File f = new File("weather.txt");
        if (f.exists()) {
            System.out.println("it exists!");

            Scanner scan = new Scanner(f);
            double sum = 0;
            double temp1 = scan.nextDouble();
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    double temp2 = scan.nextDouble();
                    System.out.printf("The difference between %.1f and %.1f is %.1f\n",
                        temp1, temp2, temp2 - temp1);
                    temp1 = temp2;
                } else {
                    scan.next();
                }
            }
        } else {
            System.out.println("noo.....");
        }
    }
}
