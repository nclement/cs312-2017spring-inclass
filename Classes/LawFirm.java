
/**
 * Write a description of class LawFirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LawFirm
{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee's salary: " + e.getSalary());
        Secretary s = new Secretary();
        System.out.println("Secretary's salary: " + s.getSalary());
    }
}
