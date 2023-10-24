
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();        
        Container second = new Container();

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = 0;
            }
            
            if (input.contains("add")) {
                first.add(amount);
                if (first.contains() > 100) {
                    first.add(100);
                }
            }
            
            if (parts[0].equals("move")) {
                if (first.contains() != 0) {
                    if (amount > first.contains()) {
                        second.add(first.contains());
                        first.remove(amount);
                    } else {
                        second.add(amount);
                        first.remove(amount);
                    }
                    if (second.contains() > 100) {
                        second.add(100);
                    }
                }
            }
            if (parts[0].equals("remove")) {
                if (amount > 0) {
                    if (first.contains() < amount) {
                        first.remove(amount);
                    } 
                    if (second.contains() < amount) {
                        second.remove(amount);
                    } else {
                        second.remove(amount);
                        first.remove(amount);
                    }
                }
            }
        }
    }

}
