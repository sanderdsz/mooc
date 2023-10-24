
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        int amount = 0;

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.contains("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = 0;
            }
            
            if (input.contains("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (parts[0].equals("move")) {
                if (first != 0) {
                    if (amount > first) {
                        second += first;
                        first = 0;
                    } else {
                        second += amount;
                        first = first - amount;
                    }
                    if (second > 100) {
                        second = 100;
                    }
                    if (first < 0) {
                        first = 0;
                    }
                }
            }
            
            if (parts[0].equals("remove")) {
                if (amount > 0) {
                    if (first < amount) {
                        first = 0;
                    } 
                    if (second < amount) {
                        second = 0;
                    } else {
                        second = second - amount;
                        first = first - amount;
                    }
                }
            }
        }
    }

}
