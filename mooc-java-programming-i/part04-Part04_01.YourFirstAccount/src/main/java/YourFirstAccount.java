
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account sanderAccount = new Account("Sander's account", 100.00);
        
        sanderAccount.deposit(20.00);

        System.out.println(sanderAccount);
    }
}
