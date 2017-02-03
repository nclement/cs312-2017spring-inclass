
/**
 * Write a description of class Newton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Newton
{
    public static void main(String[] args) {
        // All I need to change is num and it works.
        double num = 39;

        double approx = num / 2;
        System.out.println("Starting approximation is " + approx);

        /*
        double approx2 = ((num / approx) + approx)/2;

        System.out.println("Approx is: " + approx2 + " vs " + Math.sqrt(num));

        double approx3 = ((num / approx2) + approx2)/2;

        System.out.println("Approx is: " + approx3 + " vs " + Math.sqrt(num));
         */
        // Run Newton's method 10 times
        for (int i = 1; i <= 10; i++) {
            approx = ((num / approx) + approx)/2;

            System.out.println("Approx is: " + approx + " vs " + Math.sqrt(num));}
    }
}
