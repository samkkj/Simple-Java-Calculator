import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== Calculator Program ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select an operator: (+ for Addition, - for Subtraction, * for Multiplication, / for Division)");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum of " + num1 + " and " + num2 + ": " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference of " + num1 + " and " + num2 + ": " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product of " + num1 + " and " + num2 + ": " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Quotient of " + num1 + " and " + num2 + ": " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }

        scanner.close();
    }
}
