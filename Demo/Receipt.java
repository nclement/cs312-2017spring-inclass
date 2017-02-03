public class Receipt {
    public static void main(String[] args) {
        double subtotal = 38 + 40 + 30;
        double tax = subtotal * 0.08;
        double tip = subtotal * 0.15;
        double total = subtotal + tax + tip;
        
        // Calculate total owed, assuming 8% tax / 15% tip
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    } 
}
