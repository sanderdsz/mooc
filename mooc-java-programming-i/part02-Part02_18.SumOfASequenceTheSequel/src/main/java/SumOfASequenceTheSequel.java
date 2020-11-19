
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("First number? ");
        int first = scanner.nextInt();
        
        System.out.println("Last number? ");
        int last = scanner.nextInt();
        
        while (first <= last) {
            sum += first;
            first++;
        }
        System.out.println("The sum is " + sum);
    }
}
