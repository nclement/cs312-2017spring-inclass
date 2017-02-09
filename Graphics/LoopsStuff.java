import java.awt.*;

public class LoopsStuff {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 100); 
        // Set the background to gray.
        panel.setBackground(Color.LIGHT_GRAY);
        
        Graphics g = panel.getGraphics();

        // Start drawing 5 squares from position
        //    10, 10
        for (int i = 0; i < 5; i++) {
            g.drawRect(10 + 10 * i, 10 + 10 * i, 10, 10);
        }
        
        for (int i = 0; i < 5; i++) {
            g.drawRect(10 + 10 * i, 50 - 10 * i, 10, 10);
        }
    }
}