
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class JokeManager {
    
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke() {
        if (jokes.size() == 0) {
            return "Jokes are in short supply.";
        }
        Random random = new Random();
        int randomNumber = random.nextInt(jokes.size());
        return jokes.get(randomNumber);
    }
    
    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
