
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            list.add(Integer.valueOf(parts[1]));
            count = count + 1;
        }
        
        if (count > 0) {
            max = Collections.max(list);
            System.out.println("Age of the oldest: " + max);
        }
    }
}
