
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
public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList();
    }

    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        if(persons.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        Person shortest = new Person("null", 9999);
        if(persons.size() == 0) {
            shortest = null;
        }
        for(Person person: persons) {
            int current = person.getHeight();
            if(current < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if(persons.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        int index = persons.indexOf(shortest);
        persons.remove(index);
        return shortest;
    }
}
