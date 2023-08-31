
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        if (this.day == 30 && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        } else if (this.day == 30) {
            this.day = 1;
            this.month++;
        } else {
            this.day++;
        }
    }
    
    public void advance(int howManyDays) {
        if (this.day == 30 && this.month == 12) {
            this.day = howManyDays;
            this.month = 1;
            this.year++;
        } else if (this.day == 30) {
            this.day = howManyDays;
            this.month++;
        } else {
            this.day = this.day + howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int sumDay = this.day + days;
        int newDay = days;
        int newMonth = this.month;
        int newYear = this.year;
        if ((this.day + days) >= 30 && this.month == 12) {
            newDay = (this.day + days) - 30;
            newMonth = 1;
            newYear = newYear + 1;
        } else if ((this.day + days) >= 30) {
            newDay = newDay = (this.day + days) - 30;
            if (this.month >= 12) {
                newMonth = 1;
            } else {
                newMonth = newMonth + 1;
            }
        } else {
            newDay = this.day + days;
        }
        SimpleDate newDate = new SimpleDate(newDay, newMonth, newYear);
        System.out.println(this.day + " " + this.month + " " + this.year);
        return newDate;
    }

}
