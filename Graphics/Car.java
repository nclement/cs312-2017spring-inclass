import java.awt.Color;
import java.awt.Graphics;

public class Car {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300); 
        // Set the background to gray.
        panel.setBackground(Color.LIGHT_GRAY);

        Graphics g = panel.getGraphics();

        drawCar(g, 10, 30);
        drawCar(g, 120, 50);
        drawCar(g, 30, 200);
    }

    /**
     * Draws a car (ice cream truck) at a given x and y position
     */
    public static void drawCar(Graphics g, int x, int y) {
        // truck body
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 100, 50);
        // g.fillRect(10, 30, 100, 50);
        // Tires
        g.setColor(Color.RED); 
        g.fillOval(x + 10, y + 40, 20, 20); 
        g.fillOval(x + 70, y + 40, 20, 20);
        // Window
        g.setColor(Color.CYAN);
        g.fillRect(x + 70, y + 10, 30, 20);
    }
}