import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int publication_year = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(title, pages, publication_year);
            bookCollection.add(newBook);
        }
        System.out.println("What information will be printed? ");
        String print = scanner.nextLine();
        if (print.contains("name")) {
            for (Book e: bookCollection) {
                System.out.println(e.getTitle());
            }
        } else {
            for (Book e: bookCollection) {
                System.out.println(e);
            }
        }
    }
}
