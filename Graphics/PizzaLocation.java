import java.awt.*;

public class PizzaLocation {
    // Latitude and Longitude
    private int x;
    private int y;
    // Location name
    private String name;
    
    // Default constructor
    public PizzaLocation() {
        this(0, 0, "anonymous");
    }
    
    // Create a constructor with the x&y coords
    public PizzaLocation(int xPos, int yPos, String s) {
        this.x = xPos;
        this.y = yPos;
        this.setName(s);
    }
    
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
        
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
    }
    public void setName(String s) {
        if (s == null) {
            name = "you're an idiot";
        } else {
            name = s;
        }
    }
    public String getName() {
        return name;
    }
    
    // Public member functions   
    public void printLocation() {
        System.out.println(name + " is located at (" + x + "," + y + ")");
    }
    
    public void drawLocation(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString(name, x, y);
    }
    
    public double distanceFrom(PizzaLocation p2) {
        return Math.sqrt(Math.pow(p2.x - x, 2) +
                         Math.pow(p2.y - y, 2));
    }
}