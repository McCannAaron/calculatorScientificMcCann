import java.util.Scanner; // Import scanner
import java.lang.Math; // Import Math library from package

public class Calculator { // Class that runs calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Accepts inputs

        double num1; // All variables needed
        double num2;
        double stored;
        double result;
        String operator;

        num2 = 0.0; // Initialize numbers
        stored = 0.0;

        System.out.println("Welcome to the calculator.");
        System.out.println();

        System.out.print("Please enter your first number: ");
        num1 = scanner.nextDouble(); // Read from user the number they input

        System.out.println();

        System.out.println("Available options include: "); // Print list of available options
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

        boolean endCalculator = false;

        do { // do while loop to ensure calculator runs until user wants to stop
            System.out.print("Please enter one (M+, M-, MS, MR, %, /, *, +, -, SQRT, ^, Q): ");
            operator = scanner.next().toUpperCase(); // Reads the operator from above

            if (!(operator.equals("M+")) && !(operator.equals("M-")) && !(operator.equals("MS")) && !(operator.equals("MR"))
                    && !(operator.equals("SQRT")) && !(operator.equals("Q"))) { // If statement to ensure certain operations use one number
                System.out.println();
                System.out.print("Please enter your second number: ");
                num2 = scanner.nextDouble(); // Reads second number if needed
            }

            switch (operator) { // Switch statement for options
                case "MS": // Case for memory store
                    System.out.println();
                    stored = num1;
                    System.out.println("The following number is stored: " + stored);
                    System.out.println();
                    break;
                case "MR": // Case of memory recall
                    System.out.println();
                    System.out.println("The number you stored is: " + stored);
                    System.out.println();
                    break;
                case "M+": // Case for memory +
                    System.out.println();
                    if (stored == 0) {
                        System.out.println("Stored value has not been changed.");
                        System.out.println();
                        break;
                    } else {
                        System.out.print("Please number you want to add to the stored value: ");
                        num2 = scanner.nextDouble();
                        result = stored + num2;
                        System.out.println("Result of Memory+: " + result);
                        System.out.println();
                        break;
                    }
                case "M-": // Case for memory -
                    System.out.println();
                    if (stored == 0) {
                        System.out.println("Stored value has not been changed.");
                        System.out.println();
                        break;
                    } else {
                        System.out.print("Please number you want to subtract from the stored value: ");
                        num2 = scanner.nextDouble();
                        result = stored - num2;
                        System.out.println("Result of Memory-: " + result);
                        System.out.println();
                        break;
                    }
                case "%": // Case for percent
                    System.out.println();
                    System.out.print("Do you want multiply(*), divide(/), add(+), or subtract(-) the percent: ");
                    String operator2 = scanner.next();
                    if (operator2.equals("+")) { // Addition option
                        result = (num1 + ((num2 / 100) * num1));
                        System.out.println("Result of addition with percent: " + result);
                        System.out.println();
                    } else if (operator2.equals("-")) { // Subtraction option
                        result = (num1 - ((num2 / 100) * num1));
                        System.out.println("Result of subtraction with percent: " + result);
                        System.out.println();
                    } else if (operator2.equals("*")) { // Multiplication option
                        result = (num1 * (num2 / 100));
                        System.out.println("Result of multiplication with percent: " + result);
                        System.out.println();
                    } else if (operator2.equals("/")) { // Division option
                        result = (num1 / (num2 / 100));
                        System.out.println("Result of division with percent: " + result);
                        System.out.println();
                    }
                    break;
                case "/": // Case for division
                    if (num2 != 0) {
                        System.out.println();
                        result = num1 / num2;
                        System.out.println("Result of division: " + result);
                        System.out.println();
                    } else { // Ensures cannot divide by zero
                        System.out.println("Cannot divide by zero. Please try again.");
                        System.out.println();
                    }
                    break;
                case "*": // Case for multiplication
                    System.out.println();
                    result = num1 * num2;
                    System.out.println("Result of multiplication: " + result);
                    System.out.println();
                    break;
                case "+": // Case for addition
                    System.out.println();
                    result = num1 + num2;
                    System.out.println("Result of addition: " + result);
                    System.out.println();
                    break;
                case "-": // Case for subtraction
                    System.out.println();
                    result = num1 - num2;
                    System.out.println("Result of subtraction: " + result);
                    System.out.println();
                    break;
                case "SQRT": // Case for square root
                    System.out.println();
                    result = Math.sqrt(num1);
                    System.out.println("Result of square root: " + result);
                    System.out.println();
                    break;
                case "^": // Case for exponent
                    System.out.println();
                    result = Math.pow(num1, num2);
                    System.out.println("Result of exponent: " + result);
                    System.out.println();
                    break;
                case "Q": // Case for quit
                    System.out.println();
                    System.out.println("Thank you for using the calculator.");
                    endCalculator = true;
                    break;
            }
        }
        while (!endCalculator); // Do while loop quit
    }
}
