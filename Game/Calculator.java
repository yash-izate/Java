package Game;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Basic Calculator !");
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, /, *, %) : ");
        String operation = sc.next();

        double result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };

        System.out.println("Your answer : " + result);
        sc.close();
    }

}
