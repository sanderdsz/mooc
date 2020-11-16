
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int sum = first + second;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
