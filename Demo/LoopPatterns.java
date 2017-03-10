import java.util.Scanner;

/**
 * Write a description of class LoopPatterns here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopPatterns
{
    public static void main(String[] args) {
        //printNumbers(5);
        //printPrimes(8);
        //printPrimes(1);
        userInput();
    }

    public static void printNumbers(int n) {
        System.out.print(1);
        for (int i = 2; i <= n; i++) {
            System.out.print(", " + i);
        }
    }

    public static void printPrimes(int n) {
        if (n >= 2) {
            System.out.print(2);
            for (int i = 3; i <= n - 1; i++) {
                // only print if it's got exactly two factors
                // (itself and 1)
                if (countFactors(i) == 2) {
                    System.out.print(", " + i);
                }
            }
        }
    }

    public static int countFactors(int n) {
        int factors = 0;
        for (int i = n; i >= 1; i--) {
            // This means it goes into the number evenly
            if (n % i == 0) {
                factors++;
            }
        }

        return factors;
    }
    
    public static boolean isPrime(int n) {
        // Really short:
        //return countFactors(n) == 2;
        int factors = countFactors(n);
        return factors == 2;
    }

    public static void userInput() {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int randNum = console.nextInt();
        console.nextLine();
        System.out.println("You entered: " + randNum);
        String response = "something";
        while (!response.equals("quit")) {
            System.out.print("Type a line (or 'quit' to exit): ");
            response = console.nextLine();
            sum += response.length();
        }
        System.out.println("You typed a total of " + sum + " characters.");
    }

}
