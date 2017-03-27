import java.util.*;

/**
 * Write a description of class Arrays3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrays3
{
    public static void main(String[] args) {
        //System.out.println(mostFrequentDigit(669260267));
        System.out.println(TallyProblem(1_000_000));
    }

    public static int mostFrequentDigit(int n) {
        // Create a new array, one spot for each possible digit
        int[] counts = new int[10];
        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            // Add one because I've seen one of these digits.
            counts[digit]++;
        }

        int max_i = 0;
        for (int i = 1; i < 10; i++) {
            if (counts[i] > counts[max_i]) {
                max_i = i;
            }
        }

        return max_i;
    }

    public static int TallyProblem(int n) {
        int[] counts = new int[100];
        Random random = new Random();

        // Generate n random numbers
        for (int i = 0; i < n; i++) {
            // Random number from [0,100)
            int r = random.nextInt(100);
            // Record that we've seen another one.
            counts[r]++;
        }

        // init max and min to be correct
        int max = counts[0];
        int min = counts[0];
        // Find the max and min.
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > max) max = counts[i];
            if (counts[i] < min) min = counts[i];
        }

        // Return the difference.
        return max - min;
    }

    public static int[] getSectionData(String line, int numStudents) {
        int numWeeks = line.length() / numStudents;

        int[] studGrades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            studGrades[i] = getSectionSingleStudent(line, numStudents, i);
        }
        return studGrades;
    }

    public static int getSectionSingleStudent(String line, int numStudents, int studentNum) {
        int grade = 0;
        for (int i = 0; i < numWeeks; i++) {
            char c = line.charAt(numStudents * i + studentNum);
            if (c == 'y') {
                grade += 3;
            } else if (c == 'n') {
                grade += 2;
            }
        }
        return grade;
    }

}
