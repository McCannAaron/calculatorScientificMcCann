import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double stored;
        double result;
        String operator;

        num2 = 0.0;
        stored = 0.0;

        System.out.print("Please enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.println();

        System.out.println("Available options include: ");
        System.out.println("Memory+: M+");
        System.out.println("Memory-: M-");
        System.out.println("Memory Store: MS");
        System.out.println("Memory Recall: MR");
        System.out.println("Percent: %");
        System.out.println("Division: /");
        System.out.println("Multiplication: *");
        System.out.println("Addition: +");
        System.out.println("Subtraction: -");
        System.out.println("Square Root: SQRT");
        System.out.println("Exponent: ^");
        System.out.println("Quit: Q");

        System.out.println();

        System.out.print("Please enter one (M+, M-, MS, MR, %, /, *, +, -, SQRT, ^, Q): ");
        operator = scanner.next().toUpperCase();

        if (!(operator.equals("M+")) && !(operator.equals("M-")) && !(operator.equals("MS")) && !(operator.equals("MR"))
        && !(operator.equals("SQRT")) && !(operator.equals("Q"))) {
            System.out.println();
            System.out.print("Please enter your second number: ");
            num2 = scanner.nextDouble();
        }

        switch (operator) {
            case "MS":
                System.out.println();
                stored = num1;
                System.out.println("The following is stored: " + stored);
            case "%":
                System.out.println();
                System.out.print("Do you want multiply(*), divide(/), add(+), or subtract(-) the percent: ");
                String operator2 = scanner.next();
                if (operator2.equals("+")) {
                    result = (num1 + ((num2 / 100) * num1));
                    System.out.println("Result of addition with percent: " + result);
                } else if (operator2.equals("-")) {
                    result = (num1 - ((num2 / 100) * num1));
                    System.out.println("Result of subtraction with percent: " + result);
                } else if (operator2.equals("*")) {
                    result = (num1 * (num2 / 100));
                    System.out.println("Result of multiplication with percent: " + result);
                } else if (operator2.equals("/")) {
                    result = (num1 / (num2 / 100));
                    System.out.println("Result of division with percent: " + result);
                }
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println();
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Cannot divide by zero. Please try again.");
                }
                break;
            case "*":
                System.out.println();
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case "+":
                System.out.println();
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case "-":
                System.out.println();
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case "SQRT":
                System.out.println();
                result = Math.sqrt(num1);
                System.out.println("Result of square root: " + result);
                break;
            case "^":
                System.out.println();
                result = Math.pow(num1, num2);
                System.out.println("Result of exponent: " + result);
                break;
            case "Q":
                System.out.println();
                System.out.println("Thank you for using the calculator.");
                break;
        }
    }
}
