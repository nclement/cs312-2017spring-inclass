import java.util.*;
import java.io.*;

/**
 * Write a description of class ALFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ALFun
{
    public static void main(String[] args) throws FileNotFoundException {
        // Write a program that reads a file and displays the words 
        // of that file as a list.
        //  – First display all words.
        //  – Then display them in reverse order.
        //  – Then display them with all plurals (ending in "s") capitalized. 
        //  – Then display them with all plural words removed.
        
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner scan = new Scanner(new File("words.txt"));
        while (scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);
        
        reverse(words);
        System.out.println(words);
        reverse(words);
        
        System.out.println(capitalPlurals(words));
        
        // Remove all plurals
        removePlurals(words);
        System.out.println(words);
        
        addStars(words);
        System.out.println("Added: " + words);
        removeStars(words);
        System.out.println("Removed: " + words);
        
        // This will sort the words.
        Collections.sort(words);
        System.out.println(words);
    }
    
    public static void reverse(ArrayList<String> array) {
        for (int i = 0; i < array.size() / 2; i++) {
            String temp = array.get(i);
            array.set(i, array.get(array.size() - 1 -i));
            array.set(array.size() - 1 - i, temp);
        }
    }
    
    /**
     * Returns an array with all of the plurals from the first 
     * array capitalized.
     */
    public static ArrayList<String> capitalPlurals(ArrayList<String> array) {
        ArrayList<String> capitals = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).endsWith("s")) {
                capitals.add(array.get(i).toUpperCase());
            } else {
                capitals.add(array.get(i));
            }
        }
        return capitals;
    }
    
    public static void removePlurals(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).endsWith("s")) {
                array.remove(i);
                i--;
            }
        }        
    }
    
    /**
     * Takes an array, adds stars between each element.
     * 
     * So:
     * ["the", "hi"] -> ["the", "*", "hi"]
     * ["a", "b", "c"] -> ["a", "*", "b", "*", "c"]
     */
    public static void addStars(ArrayList<String> array) {
        int size = array.size() - 1;
        for (int i = 0; i < size; i++) {
            array.add(2 * i + 1, "*");
        }
    }
    
    public static void removeStars(ArrayList<String> array) {
        for (int i = 1; i < array.size(); i++) {
            array.remove(i);
        }
    }
}
