import java.util.*;
import java.io.*;

/**
 * Write a description of class FileStuff2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileStuff2
{
    public static void main(String[] args) throws FileNotFoundException {
        //printWordsPerLine("input.txt");
        PrintStream outStream = new PrintStream(new File("working_hours_res.txt"));
        //PrintStream outStream = System.out;
        getHoursWorked("working_hours.txt", outStream);
    }

    File getNewFile(String fn) {
        File f = new File(fn);
        while (f.exists()) {
            System.out.println("File exists: Choose another one");
            // Read in from the user
            fn = ____;
            f = new File(fn);
        }
        return f;
    }
    
    /**
     * Requires two parameters:
     *  inf : file to read from
     *  outf: stream to write out to.
     */
    public static void getHoursWorked(String inf, PrintStream outStream) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(inf));

        while(scan.hasNextLine()) {
            String line = scan.nextLine();

            // process the line
            processLine(line, outStream);
        }
    }

    public static String getName(String line) {
        Scanner scan = new Scanner(line);
        // Ignore the first int
        scan.nextInt();
        // Get the next String
        return scan.next();
    }

    public static void processLine(String line, PrintStream out) {
        if (line.length() <= 0) {
            return;
        }
        Scanner scan = new Scanner(line);
        // Get the first int
        int id = scan.nextInt();
        // Next thing is the name
        String name = scan.next();
        // Want to get a couple of hours worked.
        double total = 0;
        // Get all the doubles on the rest of the line.
        while(scan.hasNextDouble()) {
            double h = scan.nextDouble();
            total += h;
        }
        out.printf("%s (ID%d) worked %.1f hours (%.2f hours/day)\n",
            name, id, total, total/4);
    }

    public static void printWordsPerLine(String fn) {
        try {
            Scanner scan = new Scanner(new File(fn));

            // Grab each line from the file.
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                // Create a line scanner.
                Scanner lineScan = new Scanner(line);

                // Count the number of words
                int w = 0;
                while (lineScan.hasNext()) {
                    w++;
                    lineScan.next();
                }

                System.out.println("Line has " + w + " words");
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("oops");
        }

    }
}
