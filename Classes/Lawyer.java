
/**
 * Write a description of class Lawyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{   
    public String getName() {
        return super.getName() + ", Esq";
    }
    
    public int getVacationDays() {
        return super.getVacationDays()+3; // 3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink"; // use the pink form
    }
    
    public void sue() {
        System.out.println("I'll see you in court!");
    }
    
    public String toString() {
        return "I'm a lawyer!!";
    }
}
