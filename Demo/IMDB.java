import java.io.*;
import java.util.*;

/**
 * Write a description of class IMDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IMDB
{
    // File looks like
    /*
Votes  Rating  /BreTitle
5   4.2  "!Next?" (1994)
62   6.2  "#1 Single" (2006)
14   7.1  "#7DaysLater" (2013)
10   7.4  "#Bikerlive" (2014)
44   6.7  "#BlackLove" (2015)
15   5.9  "#ByMySide" (2012)
9   7.7  "#Cybriety" (2015)
7   7.6  "#Hashtag: The Series" (2013)
6   7.0  "#LawstinWoods" (2013)
*/
    public static void main(String[] args) throws FileNotFoundException {
        int firstNum = getNextInt("hello people I'm seventeen years old in 2 days");
        System.out.println(firstNum + " should be 2");
        firstNum = getNextInt("hi i1m 16 and today is a 7 times cool day");
        System.out.println(firstNum + " should be 16");        
        
        // The IMDB file has some issues. This is how to read from the issue-filled file.
        Scanner scan = new Scanner(new FileInputStream(new File("../ratings.list.txt")), "UTF-8");
        double rating = 9.0;
        
        // Ignore the first line
        scan.nextLine();
        int numMovies = 0;
        int numOverRating = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            
            numMovies++;
            double r = getRating(line);
            if (r > rating) {
                numOverRating++;
                System.out.println("Found " + getMovieTitle(line) + " with rating " + getRating(line));
            }
        }
        
        System.out.println("Found " + numOverRating + " movies that match your criteria");
    }
    
    /**
     * Returns the number of votes (first int) from a given line.
     */
    public static int getNumVotes(String line) {
        Scanner lineScan = new Scanner(line);
        return lineScan.nextInt();
    }
    
    public static double getRating(String line) {
        Scanner lineScan = new Scanner(line);
        lineScan.next(); // ignores the first thing.
        return lineScan.nextDouble();
    }
    
    public static String getMovieTitle(String line) {
        Scanner lineScan = new Scanner(line);
        lineScan.next(); // burns the first thing.
        lineScan.nextDouble();
        return lineScan.nextLine();
    }
    
    /**
     * line could look like "hello people I'm seventeen years old in 2 days"
     *   -> should return 2
     * if line looks like "hi i1m 16 and today is a 7 times cool day"
     *   -> should return 16
     */
    public static int getNextInt(String line) {
        Scanner lineScan = new Scanner(line);
        while (!lineScan.hasNextInt()) {
            lineScan.next();
        }
        // If I ever get here, I can "assert" that the next thing _is_ an int.
        return lineScan.nextInt();
    }
}
