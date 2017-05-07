// A class to represent employees in general (20-page manual).
public class Employee { 
    private String name;

    public String getName() {
        return name;
    }
    
    public int getHours() {
        return 40; // works 40 hours / week 
    }

    public double getSalary() {
        return 40000.0; // $40,000.00 / year
    }

    public int getVacationDays() {
        return 13; // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow"; // use the yellow form
    } 
    
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee eo = (Employee) o;

            return name.equals(eo.name);
        } else if (o instanceof String) {
            String s = (String)o;
            return name.equals(s);
        }

        return false;
    }
}