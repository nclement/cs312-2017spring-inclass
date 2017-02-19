import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("How many people ate? ");
        int ppl = console.nextInt();
        double subtotal = 0;
        
        for (int i = 0; i < ppl; i++) {
            System.out.printf("Person #%d: How much did your dinner cost? ", i + 1);
            double personCost = console.nextDouble();
            subtotal += personCost;
        }
        
        double tax = subtotal * 0.08;
        double tip = subtotal * 0.15;
        double total = subtotal + tax + tip;
        
        // Calculate total owed, assuming 8% tax / 15% tip
        System.out.printf("Subtotal: $%6.2f\n", subtotal);
        System.out.printf("Tax:      $%6.2f\n", tax);
        System.out.printf("Tip:      $%6.2f\n", tip);
        System.out.printf("Total:    $%6.2f\n", total);
    } 
}
