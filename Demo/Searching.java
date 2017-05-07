
/**
 * Write a description of class Searching here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Searching
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 9, 10, 11};
        
        System.out.println("Position of 4 is " + binarySearch(arr, 4));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Position of %d is %d (should be %d)\n",
                        arr[i], binarySearch(arr, arr[i]), i);
        }
    }
    
    /**
     * Binary search of a sorted list.
     * 
     * Returns the index of "x" or -1 if it's not found.
     */
    public static int binarySearch(int[] arr, int x) {
        // Indices that define my "sublist"
        int mid = arr.length / 2;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            // CHeck if the middle is higher or lower than the value.
            if (arr[mid] > x) {
                // means I can throw away the right portion of the array
                end = mid - 1;
            } else if (arr[mid] < x) {
                // Throw away the left portion
                start = mid + 1;
            } else {
                return mid;
            }
            mid = (end + start) / 2;
        }
        
        return -1;
    }
}
