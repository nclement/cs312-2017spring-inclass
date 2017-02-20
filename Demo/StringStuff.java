import java.util.Scanner;

/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{
    public static void main(String[] args) {
        String bjp = "Building Java Programs";
        String building = bjp.substring(0, 8);
        System.out.printf("Found: [%s]\n", building);

        System.out.printf("Found: [%s]\n", getFirst("The quick brown fox"));
        System.out.printf("Found: [%s]\n", getFirst("overjoyed"));
        System.out.printf("Found: [%s]\n", getFirst("  did I break thi"));
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = getFirstWord(scan);
        System.out.println("You entered: " + word);
        System.out.print("Enter another word: ");
        String word2 = getSecondWord(scan);     
        System.out.println("The second word was " + word2);
    }

    /**
     * This fuction will take any string and print out
     * (only) the first word.
     */
    public static String getFirst(String str) {
        int firstSpace = str.indexOf(" ");
        if (firstSpace == -1) {
            return str;
        }
        return str.substring(0, firstSpace);
    }
    
    public static String getFirstWord(Scanner s) {
        return s.next();
    }
    
    public static String getSecondWord(Scanner s) {
        s.next(); // Throw away the first word
        return s.next();
    }
    
    /**
     * DNA only consists of A,C,G, and T
     * Prints out "Is DNA" if it is valid
     * Prints out "nope" if it is not.
     */
    public static void isDNA(String s) {
        //if (s.contains("B") || s.contains("D") || s.contains("b")
        s = s.replace("A", "");
        s = s.replace("C", "");
        s = s.replace("G", "");
        s = s.replace("T", "");
        
        if (s.length() == 0) {
            System.out.println("Is DNA");
        } else {
            System.out.println("nope");
        }
    }
}
