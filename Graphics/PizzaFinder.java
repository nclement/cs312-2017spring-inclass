import java.awt.*;

/**
 * Client for class PizzaLocation
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaFinder
{
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(500, 500);
        Graphics g = dp.getGraphics();
        
        
        PizzaLocation p1 = new PizzaLocation(400, 300, "PAI 3.14");
        PizzaLocation p2 = new PizzaLocation(100, 50, "GDC atrium");
        PizzaLocation p3 = new PizzaLocation();
        
        p1.printLocation();
        p2.printLocation();
        p1.drawLocation(g);
        p2.drawLocation(g); 
        p3.drawLocation(g);
        
        System.out.println(p1.getName() + " -- " + p2.getName());
        System.out.println(p1.distanceFrom(p2));
        System.out.println(p2.distanceFrom(p1));
    }
}
