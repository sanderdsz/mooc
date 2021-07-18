
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        while (index < array.length) {
            int i = 0;
            while (i < array[index]) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            index++;
        }
    }

}
