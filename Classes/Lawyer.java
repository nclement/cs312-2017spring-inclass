
/**
 * Write a description of class Lawyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{    
    public int getVacationDays() {
        return 15; // 3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink"; // use the pink form
    }
    
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
