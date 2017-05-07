import java.awt.*;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Critter {
    private boolean doScratch;
    private Direction lastDirection;
    private int numMoves;

    public Snake(boolean northSnake) {
        doScratch = true;
        lastDirection = Direction.NORTH;
        numMoves = 0;
    }

    public Direction getMove() {
        /*
        // I've moved again!
        numMoves++;
        // See if I've moved 5 steps in that direction.
        if (numMoves > 5) {
            if (lastDirection == Direction.NORTH) {
                lastDirection = Direction.CENTER;
            } else {
                lastDirection = Direction.NORTH;
            }
            numMoves = 0;
        }
        
        return lastDirection;
        */
       
        numMoves++;
        if ( (numMoves / 5) % 2 == 0) {
            return Direction.NORTH;
        } else {
            return Direction.CENTER;
        }
    }
    
    // alternates between SCRATCH and POUNCE
    public Attack fight(String opponent) {
        doScratch = !doScratch;
        if (doScratch) {
            return Attack.SCRATCH;
        } else {
            return Attack.POUNCE;
        }
    }

    // Always eat
    public boolean eat() {
        return true;
    }

    // Always yellow
    public Color getColor() {
        return Color.YELLOW;
    }
    // Returns K
    public String toString() {
        return "K";
    }
}
