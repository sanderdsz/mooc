
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxVal = 0;
        int maxIndex = 0;
        int count = 0;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            names.add(parts[0]);
            ages.add(Integer.valueOf(parts[1]));
            count = count + 1;
        }
        
        if (count > 0) {
            maxVal = Collections.max(ages);
            maxIndex = ages.indexOf(maxVal);
            String name = names.get(maxIndex);
            System.out.println("Name of the oldest: " + name);
        }
    }
}
