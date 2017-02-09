import java.awt.Graphics;
/**
 * Write a description of class TrickQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrickQuestion
{
    public static void main(String[] args) {

        DrawingPanel p1 = new DrawingPanel(200, 200); 
        Graphics gr = p1.getGraphics();
        for(int i = 0; i < 20; i++) {
            gr.drawRect(i * 25, i * 20, 20, 50);
        }
    }
}
