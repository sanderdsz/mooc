import java.text.DecimalFormat;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } 
        if (this.euros == compared.euros && 
                this.cents < compared.cents) {
            return true;
        }
        if (this.euros < compared.euros && 
                this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        double newDecreaser = (decreaser.euros + (decreaser.cents * 0.01));
        double oldMoney = (this.euros + (this.cents * 0.01));
        double doubleValue = oldMoney - newDecreaser;
        int intEuros = (int) doubleValue;
        double decimal = doubleValue - (int) doubleValue;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int intCents = (int) (Double.parseDouble(decimalFormat.format(decimal)) * 100);
        if ((oldMoney - newDecreaser) < 0) {
            return new Money(0, 0);
        } else {
            return new Money(intEuros, intCents);
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
