import java.awt.*;

/**
 * Write a description of class FirstGraphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstGraphics
{
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        Graphics g = panel.getGraphics();
        // Draw some stuff
        g.setColor(Color.BLACK); 
        g.fillRect(10, 30, 100, 50); 
        g.drawLine(20, 0, 10, 30); 
        g.setColor(Color.WHITE);
        g.drawOval(60, 40, 40, 70);
        g.setColor(Color.RED);
        g.fillOval(60, 40, 40, 70);
        // Set background
        Color brown = new Color(192, 128, 64); 
        panel.setBackground(brown);
    }
}
