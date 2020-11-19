
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int end = scanner.nextInt();
        System.out.println("Where from?");
        int num = scanner.nextInt();
        if (num <= end) {
            for (int i = num; i < end + 1; i++) {
                System.out.println(i);
            }
        }
    }
}
