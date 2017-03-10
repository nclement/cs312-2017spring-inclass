
/**
 * Write a description of class BooleanFuncts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BooleanFuncts
{
    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));
        
        System.out.println(everyOddDigit(1111));
        System.out.println(everyOddDigit(11112));
    }
    
    /**
     * hasAnOddDigit : returns true if any digit of an integer is odd.
     */
    public static boolean hasAnOddDigit(int n) {
        while (n > 0) {
            // Grab the digit
            int digit = n % 10;
            // Take it off the number
            n /= 10;
            
            // Check for odd digit.
            if (digit % 2 == 1) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean everyOddDigit(int n) {
        while (n > 0) {
            // Grab the digit
            int digit = n % 10;
            // Take it off the number
            n /= 10;
            
            // Check for odd digit.
            if (digit % 2 == 0) {
                return false;
            }
        }
        
        return true;
    }
}
