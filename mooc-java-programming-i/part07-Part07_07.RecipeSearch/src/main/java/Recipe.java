
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredientList;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredientList() {
        return ingredientList;
    }
    
    public void addIngredient(String ingredient) {
        this.ingredientList.add(ingredient);
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
