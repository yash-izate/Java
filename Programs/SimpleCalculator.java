package Programs;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        // Consume the leftover newline character
        sc.nextLine();

        System.out.print("Enter the operator (+, -, *, /, %): ");
        String operator = sc.nextLine();

        // Use a switch expression to calculate the result
        float result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    yield Float.NaN; // Return "Not a Number" for division by zero
                } else {
                    yield num1 / num2;
                }
            }
            case "%" -> num1 % num2;
            default -> {
                System.out.println("Invalid operator. Please enter one of (+, -, *, /, %).");
                yield Float.NaN; // Return "Not a Number" for invalid operator
            }
        };

        if (!Float.isNaN(result)) {
            System.out.println("The result is: " + result);
        }

        sc.close();
    }
}
