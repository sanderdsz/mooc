
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = 999999999;
        for (int num: array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int greatest(int[] array) {
        int greatest = 0;
        for (int num: array) {
            if (num > greatest) {
                greatest = num;
            }
        }
        return greatest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = 999999999;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num < smallest) {
                index = i;
                smallest = num;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = 999999999;
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            int num = table[i];
            if (num < smallest) {
                index = i;
                smallest = num;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int numIndex1 = array[index1];        
        int numIndex2 = array[index2];
        
        array[index1] = numIndex2;
        array[index2] = numIndex1;
    }
    
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
