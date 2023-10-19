
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight <= maxWeight) {
            totalWeight += suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
