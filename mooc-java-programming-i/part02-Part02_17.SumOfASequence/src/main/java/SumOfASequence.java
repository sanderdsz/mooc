
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        
        System.out.println("Last number?");
        int end = scanner.nextInt();
        
        while (i < end) {
            sum += i + 1;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
