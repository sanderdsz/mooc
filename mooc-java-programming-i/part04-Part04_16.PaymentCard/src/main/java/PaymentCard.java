/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sander
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        // write code here
        double affordably = 2.60;
        double result = this.balance - affordably;
        if (result >= 0) {
            this.balance = result;
        }
    }

    public void eatHeartily() {
        // write code here
        double heartily = 4.60;
        double result = this.balance - heartily;
        if (result >= 0) {
            this.balance = result;
        }
    }   
    
    public void addMoney(double amount) {
        double result = 0;
        if (amount > 0) {
           result = this.balance + amount;
            if (result > 150.00) {
                this.balance = 150.00;
            } else {
                this.balance = result;
            }
        }
    }
    
    public String toString() {
        return String.valueOf(
            "The card has a balance of " + this.balance + " euros"
        );
    }
    
}
