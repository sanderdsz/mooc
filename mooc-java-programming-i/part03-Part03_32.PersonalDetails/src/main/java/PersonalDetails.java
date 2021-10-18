
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        BigDecimal avg;
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
            String name = Collections.max(names, Comparator.comparing(String::length));
            System.out.println("Longest name: " + name);
            for (int i = 0; i < ages.size(); i++) {
                sum += ages.get(i);
            }
            avg = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(ages.size()));
            System.out.println(name);
            System.out.println(sum);
            System.out.println(ages.size());
            System.out.println(avg);
            System.out.println("Average of the birth years: " + avg.setScale(1));
        }
    }
}
