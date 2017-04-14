
/**
 * Write a description of class OfficeHours here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OfficeHours
{
    public static void main(String[] args) {

        System.out.println(matchingChars("dad day", "cab sad", 'a'));
        System.out.println(matchingChars("dad day", "cab", 'a'));
        System.out.println(matchingChars("dad", "cab also", 'a'));

        String message = "this is a simple example";
        for (int row = 0; row < 2; row ++){
            for (int i = 0; i < 12; i++) {
                System.out.printf("%3d", i*5+row);
            }
            System.out.println();
        }
    }

    public static boolean matchingChars(String s1, String s2, char c) {
        if (s1.length() > s2.length()) {
            return firstMatches(s1, s2, c);
        } else {
            return firstMatches(s2, s1, c);
        }
    }

    public static boolean firstMatches(String s1, String s2, char c) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c) {
                if (s2.length() < i) {
                    return false;
                }
                if (s2.charAt(i) != c) {
                    return false;
                }
            }
        }

        return true; 
    }
}
