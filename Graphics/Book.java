import java.awt.*;

public class Book {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 350); 
        panel.setBackground(Color.BLACK);
        Graphics g = panel.getGraphics();

        drawBook(g, 10, 20);
        drawBook(g, 50, 150);
    }

    public static void drawBook(Graphics g, int x, int y) { 
        g.setColor(Color.CYAN); // cyan background 
        g.fillRect(x, y, 100, 100);
        g.setColor(Color.WHITE); // white text 
        g.drawString("COOL", x + 50, y + 20);
        int brickHeight = 10;
        int brickWidth = 20;

        for (int i = 0; i < 10; i++) { 
            // orange "bricks"
            g.setColor(new Color(191, 118, 73));
            g.fillRect(x, y + brickHeight * i, brickHeight * (i + 1), brickHeight - 1); 
            // Draw lines to make them better bricks
            // When i is 0, we need 1 extra line (one side of brick)
            //      i is 1, 2 extra lines (both sides)
            //      i is 2, 2 extra lines (one middle, one side)
            for (int j = 0; j <= (i+1)/2; j++) {
                // Every other line, we should shift over one.
                // When i is 0, shift should be brickWidth / 2
                //      i is 1, shift is 0
                // When i is 2, shift should be brickWidth / 2
                int shift = ( (i + 1) % 2 ) * brickWidth / 2;
                g.setColor(Color.WHITE);
                // Draw a line starting at the offset and same y
                // level as previous.
                g.drawLine(x + j*brickWidth + shift, y + brickHeight * i,
                    // End with the value of i + 1, but then subtract
                    // off since each brick is only 9 tall.
                    x + j*brickWidth + shift, y + brickHeight * (i + 1) - 1);
            }
        }
    }
}