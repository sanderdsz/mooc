
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
    
    private RecipeList recipeList;
    private Scanner scanner;

    public UserInterface(RecipeList recipeList, Scanner scanner) {
        this.recipeList = recipeList;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println();
        System.out.println("Commands:");        
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.contains("list")) {
                System.out.println();
                System.out.println("Recipes:");
                recipeList.print();
            }
            if (command.contains("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                recipeList.find(word);
            }
            if (command.contains("find cooking time")) {
                System.out.print("Max cooking time: ");
                String cookingTime = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                recipeList.findMaxCookingTime(Integer.valueOf(cookingTime));
            }
            if (command.contains("find ingredient")) {
                System.out.print("Ingredient: ");
                String word = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                recipeList.findByIngredient(word);
            }
            if (command.contains("stop")) {
                break;
            }
        }
    }
}
