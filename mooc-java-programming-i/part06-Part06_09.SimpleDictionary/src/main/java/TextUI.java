
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
            
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.contains("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.contains("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.contains("search")) {
                System.out.print("To be translated: ");
                String translated = scanner.nextLine(); 
                String found = simpleDictionary.translate(translated);
                if (found == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println("Translation: " + found);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
