
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
        Integer counter = 0;
        Integer wins = 0;
        Integer losses = 0;
        try (Scanner pathScanner = new Scanner(Paths.get(file))) {
            while (pathScanner.hasNextLine()) {
                String line = pathScanner.nextLine();
                String[] parts = line.split(",");
                list.add(parts[0]);
                list.add(parts[1]);
                if (parts[0].equals(team)) {
                    counter++;
                    if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (parts[1].equals(team)) {
                    counter++;
                    if (Integer.parseInt(parts[3]) > Integer.parseInt(parts[2])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Games: " + String.valueOf(counter));        
        System.out.println("Wins: " + String.valueOf(wins));
        System.out.println("Losses: " + String.valueOf(losses));

    }

}
