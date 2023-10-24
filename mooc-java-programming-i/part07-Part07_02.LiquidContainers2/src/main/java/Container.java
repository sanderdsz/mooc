/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class Container {
    
    private int current;

    public Container() {
        this.current = 0;
    }
    
    public int contains() {
        return current;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            current += amount;
            if (current > 100) {
                current = 100;
            }
        }
    }
    
    public void remove(int amount) {
        current = current - amount;
        if (current < 0) {
            current = 0;
        }
    }
    
    public String toString() {
        return current + "/100";
    }
}
