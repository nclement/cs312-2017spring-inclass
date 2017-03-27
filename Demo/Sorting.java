import java.util.*;

/**
 * Implementation of a bunch of sorting methods (some less intelligent)
 * 
 * A good video of these is here: https://www.youtube.com/watch?v=kPRA0W1kECg
 *  - selection sort at 0:00
 *  - insertion sort at 0:10
 *  - bubble sort at 3:59
 *  - bogo sort at 5:17
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sorting
{
    public static final boolean DEBUG = false;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many for selection sort? ");
        int numNums = keyboard.nextInt();

        //int[] myArr = {5, 9, 6, -15, -100};
        int[] myArr = getRandomArray(numNums, -100, 100);
        //System.out.println("StartingSS: " + Arrays.toString(myArr));

        long start = System.currentTimeMillis();
        selectionSort(myArr);

        System.out.println("Ending  SS in " + (System.currentTimeMillis() - start) + "ms");

        // Insertion sort
        System.out.print("How many for insertion sort? ");
        numNums = keyboard.nextInt();
        myArr = getRandomArray(numNums, -100, 100);
        //System.out.println("StartingIS: " + Arrays.toString(myArr));

        start = System.currentTimeMillis();
        insertionSort(myArr);

        System.out.println("Ending in " + (System.currentTimeMillis() - start) + "ms");

        // Bubble sort
        System.out.print("How many for bubble sort? ");
        numNums = keyboard.nextInt();
        myArr = getRandomArray(numNums, -100, 100);
        //System.out.println("StartingBS: " + Arrays.toString(myArr));

        start = System.currentTimeMillis();
        bubbleSort(myArr);

        System.out.println("Ending in " + (System.currentTimeMillis() - start) + "ms");

        // Bogo sort
        System.out.print("How many for bogo sort? ");
        numNums = keyboard.nextInt();
        myArr = getRandomArray(numNums, -100, 100);
        System.out.println("StartingBogoS: " + Arrays.toString(myArr));

        start = System.currentTimeMillis();
        bogoSort(myArr);

        System.out.println("Ending in " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = smallestIdx(nums, i);
            swap(nums, i, minIdx);
        }
    }

    public static void insertionSort(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int x = arr[i];
            // Keep going until we've either got to the beginning
            // of the list, or found the correct sorted position.
            while (j >= 0 && arr[j] > x) {
                // Swap the jth and (j+1)th elements.
                swap(arr, j + 1, j);
                // Decrement this position
                j--;
            }

            if (DEBUG) System.out.println(count + " - " + Arrays.toString(arr));
            count++;
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        int count = 0;
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            if (DEBUG) System.out.println(count + " - " + Arrays.toString(arr));
            count ++;
        }
    }

    public static int smallestIdx(int[] nums, int start) {
        int min_idx = start;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] < nums[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    public static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static int[] getRandomArray(int size, int min, int max) {
        int[] x = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            x[i] = r.nextInt(max - min) + min;
        }

        return x;
    }


    /**
     * Fisher–Yates shuffle array function
     */
    private static void shuffleArray(int[] array)
    {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(i + 1);
            swap(array, index, i);
        }
    }

    /**
     * Not a very good algorithm
     * Average case: O((n+1)!)
     */
    public static void bogoSort(int[] arr) {
        int count = 0;
        while(!isSorted(arr)) {
            shuffleArray(arr);
            if (DEBUG) System.out.println(count + " - " + Arrays.toString(arr));
            count ++;
        }
    }
}
