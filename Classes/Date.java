
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    int year;
    // 1 - January
    // 2 - February
    // ...
    // 12 December
    Month month;
    int day;
    private static final String[] MONTH_NAMES = {"Jan","Feb","Mar"};
    
    public Date(int d, Month m, int y) {
        day = d;
        month = m;
        year = y;
    }
    
    public String toString() {
        // 23 Feb, 2017
        // 14 Apr, 2017
        String strDate = "";
        strDate += day + " ";
        // Add the string version of the month

        if (month == Month.JAV) {
            strDate += "Jav";
        } else if (month == Month.FEB) {
            strDate += "Feb";
        } else if (month == Month.MAR) {
            strDate += "Mar";        
        }
        
        // Add a comma and the year
        strDate += ", " + year;
        
        return strDate;
    }
}
