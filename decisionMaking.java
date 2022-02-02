import java.util.Scanner;

public class decisionMaking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsious = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius:",  celsious);

        if (fahrenheit >= 70) {
            System.out.println("Yay! go to park.");
        }
    }
}