
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.valueOf(reader.nextLine());
        
        if (number < 0) { // if the sum is over 100
            int result = number * (-1);
            System.out.println(result);
        } else { // otherwise
            System.out.println(number);
        }

    }
}
