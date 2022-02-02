import java.util.Scanner;

public class ifStatementPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in the temperature: ");
        int temperature = scanner.nextInt();
        if (temperature == 20) {
            System.out.println("It's time to go to park.");
        } else {
            System.out.println("Never mind. I will stay home today.");
        }
    }
}