
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
public class Stack {
    
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList();
    }
    
    public boolean isEmpty() {
        return stacks.isEmpty();
    }
    
    public void add(String value) {
        stacks.add(value);
    }
    
    public ArrayList<String> values() {
        return stacks;
    }
    
    public String take() {
        String take = stacks.get(stacks.size() - 1);
        stacks.remove(stacks.size() - 1);
        return take;
    }
}
