import java.util.*;

/**
 * Write a description of class SortingCompares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortingCompares
{
    public static void main(String[] args) {
        System.out.println(compareTwo("dog", "dogma")); // should be 1
        System.out.println(compareTwo("dogma", "dog")); // should be 2
        
    }
    
    
    /**
     * Will return 1 if a should come before b, and 2 if b should
     * come before a. If they're the same, return 0.
     */
    public static int compareTwo(String a, String b) {
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            // See if a comes before b.
            if (a.charAt(i) < b.charAt(i)) {
                return 1;
            } else if (a.charAt(i) > b.charAt(i)) {
                return 2;
            }
        }
        // Equal up to the number of checked characters
        if (a.length() < b.length()) {
            return 1;
        } else if (a.length() > b.length()) {
            return 2;
        }
        return 0;
    }
}
