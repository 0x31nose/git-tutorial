import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
    public static void main(String[] args) {
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add, subtract, multiply, divide, and alphabetize.");
        System.out.println("Enter an operation: ");
        String operation = input.nextLine().toLowerCase();
        if (operation != "add" && operation != "subtract" && operation != "multiply" && operation != "divide" && operation != "alphabetize") {
            System.out.println("Invalid input entered. Terminating...");
        }

        switch (operation){
            case "add":
                System.out.println("Enter two integers: ");
                int firstAdd = input.nextInt();
                int secondAdd = input.nextInt();
                if (firstAdd instanceof Integer && secondAdd instanceof Integer) {
                    int resultAdd = firstAdd + secondAdd;
                    System.out.println("Answer: " + resultAdd);
                    break;
                }
                System.out.println("Invalid input entered. Terminating...");
            case "subtract":
                System.out.println("Enter two integers: ");
                int firstSub = input.nextInt();
                int secondSub = input.nextInt();
                if (firstSub instanceof Integer && secondSub instanceof Integer) {
                    System.out.println("Invalid input entered. Terminating...");
                    int resultSub = firstSub - secondSub;
                    System.out.println("Answer: " + resultSub);
                    break;
                }
                System.out.println("Invalid input entered. Terminating...");
            case "multiply":
                System.out.println("Enter two doubles: ");
                double firstMul = input.nextDouble();
                double secondMul = input.nextDouble();
                double resultMul = firstMul * secondMul;
                System.out.println("Answer: " + twoDecimal.format(resultMul));
                break;
            case "divide":
                System.out.println("Enter two doubles: ");
                double firstDiv = input.nextDouble();
                double secondDiv = input.nextDouble();
                if (secondDiv == 0) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                else {
                    double resultDiv = firstDiv / secondDiv;
                    System.out.println("Answer: " + twoDecimal.format(resultDiv));                
                    break;
                }
            case "alphabetize":
                System.out.println("Enter two strings: ");
                String firstAlp = input.next();
                String secondAlp = input.next();
                if (firstAlp.toLowerCase().compareTo(secondAlp.toLowerCase()) < 0) {
                    System.out.println("Answer: " + firstAlp + " comes before " + secondAlp + " alphabetically.");
                }
                else if (firstAlp.compareTo(secondAlp) == 0) {
                    System.out.println("Answer: Chicken or Egg.");
                }
                else {
                    System.out.println("Answer: " + secondAlp + " comes before " + firstAlp + " alphabetically.");
                }
                break;
        }



    }
}
