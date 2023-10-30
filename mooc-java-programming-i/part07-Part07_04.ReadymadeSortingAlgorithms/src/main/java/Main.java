
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12, 0};        
        String[] words = {"a", "c", "r", "z", "e", "g"};
        sort(array);
        sort(words);
        
        int[] t = {2, 1, 3, 0}; 
        sort(t); 
        System.out.println(Arrays.toString(t));
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        integers.sort(null);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        strings.sort(null);
        System.out.println(strings);
    }
}
