
/**
 * Write a description of class Shining here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shining
{
    public static void say1000() {
        say100();
        say100();
        say100();
        say100();
        say100();
        say100();
        say100();
        say100();
        say100();
        say100();
    }
    
    public static void say100() {
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
        sayTen();
    }
    public static void sayTen() {
        sayFive();
        sayFive();
    }
    
    public static void sayFive() {
        sayTwice();
        sayTwice();
        System.out.println("All work and no play makes Jack a dull boy");
    }
    
    public static void sayTwice() {
        System.out.println("All work and no play makes Jack a dull boy");
        System.out.println("All work and no play makes Jack a dull boy");
    }
    
    public static void main(String[] args) {
        // Change this program so it will only repeat 78 times
        say1000();
    }
}
