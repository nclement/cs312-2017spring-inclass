import java.util.*;
public class BMI {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter next person's information:"); 

        System.out.print("height (in inches)? ");
        double height = console.nextDouble();
        System.out.print("weight (in pounds)? "); 
        double weight = console.nextDouble();
        double bmi = weight * 703 / height / height;
        System.out.printf("BMI = %.2f\n", bmi); 
        if (bmi < 18.5)
            System.out.println("underweight"); 
        else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese"); 
        }

    }
    
    public static void introduction() {
                System.out.println("This program reads ... (etc.)")o
    }
}
