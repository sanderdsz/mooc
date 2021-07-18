
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter username: ");
        String username = scanner.nextLine();
        System.out.printf("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("alex")) {
            if (password.equals("sunshine")) {
                System.out.printf("You have successfully logged in!");
            } else {
                System.out.printf("Incorrect username or password!");
            }
        } else if (username.equals("emma")) {
            if (password.equals("haskell")) {
                System.out.printf("You have successfully logged in!");
            } else {
                System.out.printf("Incorrect username or password!");
            }
        }
    }
}
