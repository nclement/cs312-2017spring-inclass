import java.util.*;

/**
 * Write a description of class ArrayFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayFun
{
    public static void main(String[] args) {
        int[] iqs = {120, 98};
        int[] stiqs = stutter(iqs, 3);

        int[] iqs2 = Arrays.copyOf(iqs);
        iqs2[1] = 9;

        int[] arr = {11, 42, -5, 27, 0, 89};
        System.out.println("Orig is: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Swap is: " + Arrays.toString(arr));
    }

    // Returns a new array with two copies of each value. 
    // Example: [1, 4, 0, 7] -> [1, 1, 4, 4, 0, 0, 7, 7] 
    public static int[] stutter(int[] numbers, int howMany) {
        if (numbers.length < howMany) {
            howMany = numbers.length;
        }

        int[] result = new int[2 * howMany];
        for (int i = 0; i < howMany; i++) {
            result[2 * i]     = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }

    public static void bar(int[] d) {
        d[0]++;
        d = new int[] {4, 6};
        System.out.print(Arrays.toString(d) + " "); 
    }
}
