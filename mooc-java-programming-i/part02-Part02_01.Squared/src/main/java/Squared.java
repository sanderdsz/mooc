
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());

        int square = number * number;

        // Printing the result of the operation
        System.out.println(square);

    }
}
