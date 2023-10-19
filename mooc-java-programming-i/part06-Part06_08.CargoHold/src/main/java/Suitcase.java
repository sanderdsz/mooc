
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + totalWeight <= maxWeight) {
            totalWeight += item.getWeight();
            items.add(item);
        };
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getMaxWeight() {
        /*
        for(Item item: items) {
            this.maxWeight += item.getWeight();
        }
        return this.maxWeight;
        */
        return maxWeight;
    }
    
    public void printItems() {
        String phrase = "";
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (items.size() - 1 == i) {
                phrase += item.getName() + " (" + item.getWeight() + " kg)";
            } else {
                phrase += item.getName() + " (" + item.getWeight() + " kg)" + "\n"; 
            }
        }
        System.out.println(phrase);
    }
    
    public int totalWeight() {
        return totalWeight;
    }
    
    public Item heaviestItem() {
        Item heaviest = new Item("", 0);
        if (items.size() == 0) {
            return null;
        }
        for (Item item: items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }
    
}
