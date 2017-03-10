
/**
 * Write a description of class Flips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flips
{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i += 5) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("num flips for %d is %d\n", i, numFlips(i));
            }
        }
    }

    /**
     * Will flip a coin until there are N heads *in a row*.
     * 
     * Math.random() -> [0, 1)
     *  - greater than 0.5 => heads
     *  - less than or equals to 0.5 => tails
     *  
     * Returns the number of flips it took to get N heads.
     * 
     * For example:
     *  1- 0.2(T)
     *  2- 0.1(T)
     *  3- 0.8(H) 1
     *  4- 0.7(H) 2
     *  5- 0.1(T)
     *  6- 0.9(H) 3
     *  7- 0.9(H) 4
     *  8- 0.4(T)
     *  9- 0.8(H) 5
     * will return 9
     */
    public static int numFlips(int N) {
        int numHeads = 0;
        int numFlips = 0;
        while ( numHeads < N ) {
            // Flip a random coin
            double flip = Math.random();
            numFlips++;
            // If it's > 0.5, it's a head
            if (flip > 0.5) {
                numHeads++;
            } else {
                // I've just flipped a tails.
                numHeads = 0;
            }

        }

        return numFlips;
    }
}
