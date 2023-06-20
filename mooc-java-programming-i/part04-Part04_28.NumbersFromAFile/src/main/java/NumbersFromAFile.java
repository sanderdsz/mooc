
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();        
        ArrayList<String> newList = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner pathScanner = new Scanner(Paths.get(file))) {
            while (pathScanner.hasNextLine()) {
                String row = pathScanner.nextLine();
                list.add(row);
            }
            list.forEach(numString -> {
                int number = Integer.valueOf(numString);
                if (number >= lowerBound & number <= upperBound) {
                    newList.add(numString);
                }
            });
            System.out.println("Numbers: " + newList.size());
        } catch (Exception e) {
            System.out.println("Reading the file" + file + "failed.");
        }
    }

}
