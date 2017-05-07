
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
        Lawyer l = new Lawyer();
        System.out.println("Lawyer's vacation: " + l.getVacationDays());
        System.out.println(l);
        
        System.out.println("Same thing, but with employees");
        Employee e2 = new Employee();
        System.out.println("Employee's salary: " + e2.getSalary());
        Employee s2 = new Secretary();
        System.out.println("Secretary's salary: " + s2.getSalary());
        Employee l2 = new Lawyer();
        System.out.println("Lawyer's vacation: " + l2.getVacationDays());
        System.out.println(l2);
        
        // Create a law firm with 1000 people in it, print out their info
        Employee[] employees = new Employee[100];
        employees[0] = new Employee();
        employees[1] = new Secretary();
        employees[2] = new Lawyer();
        // so on.
        
        String nothing = "";
        System.out.println(employees[0].equals(nothing) + 
                        " and " + nothing.equals(employees[0]));
    }
    
    public static void doStuff(Employee[] emps) {
        for (int i = 0; i < emps.length; i++) {
            emps[i].getSalary();
        }
    }
}
