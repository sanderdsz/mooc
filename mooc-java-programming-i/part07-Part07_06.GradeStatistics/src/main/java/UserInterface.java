
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class UserInterface {
    
    private GradeList gradeList;
    private Scanner scanner;

    public UserInterface(GradeList gradeList, Scanner scanner) {
        this.gradeList = gradeList;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            String command = scanner.nextLine();
            int value = Integer.valueOf(command);
            if (value == -1) {
                double average = gradeList.average();
                System.out.println("Point average (all): " + average);
                double passingGrade = gradeList.passingGrade();
                if (passingGrade == 0) {
                    System.out.println("Point average (passing): -");
                    System.out.println("Pass percentage: 0.0");
                } else {
                    double percentage = gradeList.passPercentage();
                    System.out.println("Point average (passing): " + passingGrade);
                    System.out.println("Pass percentage: " + percentage);
                }
                gradeList.gradeDistribution();
                break;
            } else {
                gradeList.add(value);
            }
        }
    }
    
}
