/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;

    public Bird(String name, String latin, int observations) {
        this.name = name;
        this.latin = latin;
        this.observations = observations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservations() {
        return observations;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observations + " observations";
    }
}
