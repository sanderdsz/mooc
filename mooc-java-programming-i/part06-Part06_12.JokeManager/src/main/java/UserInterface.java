
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
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        this.commandSelector();
    }
    
    private static void printUI() {
        System.out.println("Commands:");        
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");        
        System.out.println("X - stop");
    }
    
    private void commandSelector() {
        while (true) {
            this.printUI();
            String command = scanner.nextLine();
            if (command.contains("1")) {
                this.addJokes();
            }
            if (command.contains("2")) {
                this.drawJoke();
            }
            if (command.contains("3")) {
                this.listJokes();
            }
            if (command.contains("X")) {
                break;
            }
        }
    }
    
    private void addJokes() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.manager.addJoke(joke);
    }
    
    private void drawJoke() {
        String joke = this.manager.drawJoke();
        System.out.println(joke);
    }
    
    private void listJokes() {
        this.manager.printJokes();
    }
}

