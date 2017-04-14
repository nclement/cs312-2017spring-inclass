
/**
 * Write a description of class DateClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DateClient
{
    public static void main(String[] args) {
        Date d1 = new Date(14, Month.MAR, 2017);
        Date d2 = new Date(14, Month.JAV, 2017);
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        Month m1 = Month.JAV;
        Month m2 = Month.FEB;
        System.out.println(Month.JAV == Month.JAV);
    }
}
