
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String phrase = "The collection " + name;
        if (elements.isEmpty()) {
            return phrase + " is empty.";
        } else {
            phrase = phrase + " has " + elements.size();
            String collection = "";
            if (elements.size() == 1) {
                phrase = phrase + " element:";
                collection = elements.get(0);
            } else {
                phrase = phrase + " elements:";
                for (String element: elements) {
                    collection += element + "\n";
                }
            }
            return phrase + "\n" + collection;
        }
    }
    
}
