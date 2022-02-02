import java.util.Scanner;

public class EqualityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in any strings in x: ");
        String x = scanner.next();
        System.out.print("Please type in any strings in y: ");
        String y = scanner.next();
    
    if (x == y) {
        System.out.println("x and y are aliases.");
    }

    if (x != y) {
        System.out.println("x and y are not aliases.");
    }

    if (x.equals(y)) {
        System.out.println("x and y have the same contents.");
        System.out.println("x and y have the same contents.");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    }
}
