
/**
 * Write a description of class Hams here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hams
{
    public static void main(String[] args) {
        Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()}; 
        
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]); 
            food[i].a();
            System.out.println();
            food[i].b();
            System.out.println();
            System.out.println();
        }

    }
}
