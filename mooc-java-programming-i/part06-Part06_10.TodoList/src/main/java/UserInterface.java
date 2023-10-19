
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.contains("add")) {
                this.add();
            }
            if (command.contains("list")) {
                this.list();
            }
            if (command.contains("remove")) {
                this.remove();
            }
            if (command.contains("stop")) {
                break;
            }
        }
    }
    
    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.todoList.add(task);
    }
    
    private void list() {
        this.todoList.print();
    }
    
    private void remove() {
        System.out.print("Which one is removed? ");
        String number = scanner.nextLine();
        Integer index = Integer.parseInt(number);
        this.todoList.remove(index);
    }

}
