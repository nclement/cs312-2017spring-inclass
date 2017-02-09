public class Book {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 150); panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(20, 35, 100, 100);
        g.setColor(Color.WHITE); g.drawString("BJP", 70, 55);
        // cyan background
        // white "bjp" text
        for (int i = 0; i < 10; i++) { // orange "bricks"
            g.setColor(new Color(191, 118, 73));
            g.fillRect(20, 35 + 10 * i, 10 + 10 * i, 9);
            g.setColor(Color.WHITE);
            for (int j = 1; j <= i; j++) {
                g.drawLine(20, 35 + 10 * i, 20, 45 + 10 * i);
            }
        }
    }
}