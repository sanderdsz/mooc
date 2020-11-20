
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            int num = beginning;
            if (num % 3 == 0) {
                System.out.println(num);
            }
            beginning++;
        }
    }

}
