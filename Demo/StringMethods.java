
/**
 * Write a description of class StringMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringMethods
{
    public static void main(String[] args) {
        testWords("car", "STAR");
        testWords("it", "a");
    }
    
    public static void testWords(String a, String b) {
        System.out.printf("Testing [%s] vs [%s]\n", a, b);
        boolean rh = rhymes(a, b);
        boolean al = alliterates(a, b);

        if (rh) {
            System.out.println("Rhymes!");
        }
        if (al) {
            System.out.println("Alliterates!");
        }
    }

    /**
     * Prints out "They rhyme!" if the two strings end in
     * the same two letters
     */
    public static boolean rhymes(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() >= 2 && b.length() >= 2) {
            // First, get the last two characters of the first string
            String lastTwoA = a.substring(a.length() - 2);
            if (b.endsWith(lastTwoA)) {
                return true;
            }
        }
        
        return false;
    }

    /**
     * Prints out "They alliterate!" if the two strings start with
     * the same letter.
     */
    public static boolean alliterates(String a, String b) {
        a.toLowerCase();
        b.toLowerCase();

        if (a.length() >= 1 && b.length() >= 1) {
            // First, get the last two characters of the first string
            String firstA = a.substring(0, 1);
            String firstB = b.substring(0, 1);
            if (firstA.equalsIgnoreCase(firstB)) {
                return true;
            }
        }
        
        return false;
    }
}
