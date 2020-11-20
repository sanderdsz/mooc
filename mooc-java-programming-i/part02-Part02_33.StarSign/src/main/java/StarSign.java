
public class StarSign {

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        
        System.out.println("\n---");
        printRectangle(17, 3);

        System.out.println("\n---");
        printTriangle(3);
       
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            int count = 1;
            while (true) {    
                System.out.print("*");
                if (count >= size) {
                    break;
                }
                count++;
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            int count = 1;
            while (true) {    
                System.out.print("*");
                if (count >= width) {
                    break;
                }
                count++;
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
