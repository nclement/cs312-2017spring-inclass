import java
/**
 * Write a description of class AraysExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AraysExtra
{
    public static void main(String[] args) {
        int N = 1000;
        int M = 100;
        int[] arr = new int[M];
        Random rand = new Random();
        for (int i = 0; i < M; i++) {
            arr[i] = rand.nextInt(N - 1) + 1;
        }

        System.out.println(hasDuplicates(arr, N));
    }

    /**
     * This function will return true if there are any duplicate
     * elements in this array.
     * 
     * The numbers in the array are all [1,N), i.e. generated with 
     *    arr[i] = rand.nextInt(N - 1) + 1
     */
    public static boolean hasDuplicates(int[] arr, int N) {
        // This will sort arr.
        Arrays.sort(arr);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean hasDuplicatesNested(int[] arr, int N) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static boolean hasDuplicatesTally(int[] arr, int N) {
        // Create a counter array
        int[] counts = new int[N];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                return true;
            }
        }

        return false;
    }
    
    
    /**
     * Returns the number of characters in the longest run in the given
     * character array.
     * 
     * For example:
     *    longestRun({'a', 'a', 'b'}) -> returns 2
     *    longestRun({'a', 'a', 'b', 'c', 'c', 'c'}) -> returns 3
     *    longestRun({'c', 'c', 'b', 'c', 'c', 'c'}) -> returns 3
     */
    public static int longestRun(char[] arr) {
        
    }
}
