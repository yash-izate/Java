package Programs;

import java.util.Scanner;

public class MinimumOfTwoNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to find minimum of two numbers!");
    System.out.print("Enter first number: ");
    float a = sc.nextFloat();
    System.out.print("Enter second number: ");
    float b = sc.nextFloat();

    float max = (a > b) ? a : b;
    System.out.println("Maximum number is " + max);
    sc.close();
  }

}
