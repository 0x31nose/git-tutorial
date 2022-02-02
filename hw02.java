import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
    public static void main(String[] args) {
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add, subtract, multiply, divide, and alphabetize.");
        System.out.print("Enter an operation: ");
        String operation = input.nextLine();

        switch (operation){
            case "add":
                System.out.print("Enter two integers: ");
                int firstAdd = input.nextInt();
                int secondAdd = input.nextInt();
                int resultAdd = firstAdd + secondAdd;
                System.out.println("Answer: " + resultAdd);
                break;
            case "subtract":
                System.out.print("Enter two integers: ");
                int firstSub = input.nextInt();
                int secondSub = input.nextInt();
                int resultSub = firstSub - secondSub;
                System.out.println("Answer: " + resultSub);
                break;
            case "multiply":
                System.out.print("Enter two doubles: ");
                double firstMul = input.nextDouble();
                double secondMul = input.nextDouble();
                double resultMul = firstMul * secondMul;
                System.out.println("Answer: " + twoDecimal.format(resultMul));
                break;
            case "divide":
                System.out.print("Enter two doubles: ");
                double firstDiv = input.nextDouble();
                double secondDiv = input.nextDouble();
                if (secondDiv == 0) {
                    System.out.println("You cannot divide by 0.");
                    break;
                }
                else {
                    double resultDiv = firstDiv / secondDiv;
                    System.out.println("Answer: " + twoDecimal.format(resultDiv));                
                    break;
                }
            case "alphabetize":
                System.out.print("Enter two strings: ");
                String firstAlp = input.next();
                String secondAlp = input.next();
                if (firstAlp.compareTo(secondAlp) < 0) {
                    System.out.print(firstAlp + " comes before " + secondAlp + " alphabetically.");
                }
                else if (firstAlp.compareTo(secondAlp) == 0) {
                    System.out.print(secondAlp + " equals to" + firstAlp + " alphabetically.");
                }
                else {
                    System.out.print(secondAlp + " comes before " + firstAlp + " alphabetically.");
                }
                break;
        }



    }
}
