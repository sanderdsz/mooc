
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        ArrayList<Bird> birds = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        boolean shouldLoop = true;
        
        while (shouldLoop) {
            System.out.print("? ");
            String command = scan.nextLine();

            switch (command) {
                case "Quit":
                    shouldLoop = false;
                    break;
                case "Add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String latin = scan.nextLine();
                    birds.add(new Bird(name, latin, 0));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String search = scan.nextLine();
                    for (int i=0; i < birds.size(); i++) {
                        Bird bird = birds.get(i);
                        if (Objects.equals(bird.getName(), search)) {
                            int counter = bird.getObservations();
                            counter = counter + 1;
                            bird.setObservations(counter);
                            birds.set(i, bird);
                        } else {
                            System.out.println("Not a bird!");
                        }
                    }
                    break;
                case "All":
                    for (Bird bird: birds) {
                        System.out.println(bird);
                    }
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String searchOne = scan.nextLine();
                    for (Bird bird : birds) {
                        if (Objects.equals(bird.getName(), searchOne)) {
                            System.out.println(bird);
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
