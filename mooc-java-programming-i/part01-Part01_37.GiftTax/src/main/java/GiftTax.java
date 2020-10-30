
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of the gift?");
        float gift = Float.parseFloat(reader.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            double result = (100 + ((gift - 5000) * 0.080));
            System.out.println("Tax: " + result);
        } else if (gift >= 25000 && gift < 55000) {
            double result = (1700 + ((gift - 25000) * 0.10));
            System.out.println("Tax: " + result);
        } else if (gift >= 55000 && gift < 200000) {
            double result = (4700 + ((gift - 55000) * 0.120));
            System.out.println("Tax: " + result);
        } else if (gift >= 200000 && gift < 1000000) {
            double result = (22100 + ((gift - 200000) * 0.150));
            System.out.println("Tax: " + result);
        } else {
            double result = (142100 + ((gift - 1000000) * 0.170));
            System.out.println("Tax: " + result);
        }
    }
}
