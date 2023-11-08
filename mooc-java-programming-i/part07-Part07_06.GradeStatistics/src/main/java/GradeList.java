
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
public class GradeList {
    
    private ArrayList<Integer> gradeList;

    public GradeList() {
        this.gradeList = new ArrayList<>();
    }
    
    public void add(Integer grade) {
        if (grade < 0 || grade > 100) {
            return;
        }
        gradeList.add(grade);
    }
    
    public void remove(int index) {
        gradeList.remove(index - 1);
    }
    
    public double average() {
        int sum = 0;
        for (int grade: gradeList) {
            sum = sum + grade;
        }
        double average = (double) sum / gradeList.size();
        return average;
    }
    
    public double passingGrade() {
        int quantity = 0;
        int sum = 0;
        for (int grade: gradeList) {
            if (grade > 49) {
                quantity++;
                sum = sum + grade;
            }
        }
        double passing = (double) sum / quantity;
        if (quantity == 0) {
            return 0;
        } else {
            return passing;
        }
    }
    
    public double passPercentage() {
        int quantity = 0;
        for (int grade: gradeList) {
            if (grade > 49) {
                quantity++;
            }
        }
        if (quantity == 0) {
            return 0;
        } else {
            return 100.0 * quantity / gradeList.size();
        }
    }
    
    public void gradeDistribution() {
        HashMap<Integer, Integer> distribution = new HashMap<>();
        for (int grade: gradeList) {
            if (grade < 50) {
                if (distribution.get(0) == null) {
                    distribution.put(0, 0);
                } else {
                    int count = distribution.get(0);
                    count = count + 1;
                    distribution.put(0, count);
                }
            }
            if (grade >= 50 && grade < 60) {
                if (distribution.get(1) == null) {
                    distribution.put(1, 0);
                } else {
                    int count = distribution.get(1);
                    count = count + 1;
                    distribution.put(1, count);
                }
            }
            if (grade >= 60 && grade < 70) {
                if (distribution.get(2) == null) {
                    distribution.put(2, 0);
                } else {
                    int count = distribution.get(2);
                    count = count + 1;
                    distribution.put(2, count);
                }
            }
            if (grade >= 70 && grade < 80) {
                if (distribution.get(3) == null) {
                    distribution.put(3, 0);
                } else {
                    int count = distribution.get(3);
                    count = count + 1;
                    distribution.put(3, count);
                }
            }
            if (grade >= 80 && grade < 90) {
                if (distribution.get(4) == null) {
                    distribution.put(4, 0);
                } else {
                    int count = distribution.get(4);
                    count = count + 1;
                    distribution.put(4, count);
                }
            }
            if (grade >= 90) {
                if (distribution.get(5) == null) {
                    distribution.put(5, 0);
                } else {
                    int count = distribution.get(5);
                    count = count + 1;
                    distribution.put(5, count);
                }
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + gradeDistributionConstructor(distribution.get(5)));        
        System.out.println("4: " + gradeDistributionConstructor(distribution.get(4)));
        System.out.println("3: " + gradeDistributionConstructor(distribution.get(3)));
        System.out.println("2: " + gradeDistributionConstructor(distribution.get(2)));
        System.out.println("1: " + gradeDistributionConstructor(distribution.get(1)));
        System.out.println("0: " + gradeDistributionConstructor(distribution.get(0)));
    }
    
    public String gradeDistributionConstructor(Integer quantity) {
        if (quantity == null) {
            return "";
        }
        int count = 0;
        String stars = "";
        while (count <= quantity) {
            stars += "*";
            count = count + 1;
        }
        return stars;
    }
}
