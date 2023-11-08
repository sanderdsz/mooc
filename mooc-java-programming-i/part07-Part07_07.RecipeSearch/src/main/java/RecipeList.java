
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
public class RecipeList {
    
    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipeList.add(recipe);
    }
    
    public void find(String name) {
        for (int i = 0; i < recipeList.size(); i++) {
            Recipe recipe = recipeList.get(i);
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findMaxCookingTime(int maxTime) {
        for (int i = 0; i < recipeList.size(); i++) {
            Recipe recipe = recipeList.get(i);
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String word) {
        System.out.println(word);
        for (Recipe e : recipeList) {
            if (e.getIngredientList().contains(word)) {
                System.out.println(e);
            }
        }
    }
    
    public void print() {
        for (Recipe recipe: recipeList) {
            System.out.println(recipe);
        }
    }

}
