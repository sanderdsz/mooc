
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        int i = 1;
        
        System.out.println("Give a number: ");
        int end = scanner.nextInt();
        
        for (i=1; i <= end; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);

    }
}
