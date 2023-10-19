
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class TodoList {
    
    private ArrayList<String> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        taskList.add(task);
    }
    
    public void remove(int number) {
        taskList.remove(number - 1);
    }
    
    public void print() {
        for (int i = 0; i < taskList.size(); i++) {
            String builder = (i + 1) + ": " + taskList.get(i);
            System.out.println(builder);
        }
    }
}
