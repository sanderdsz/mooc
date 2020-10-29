
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String first = String.valueOf(reader.nextLine());
        String second = String.valueOf(reader.nextLine());

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
