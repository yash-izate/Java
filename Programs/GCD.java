package Programs;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Greatest Common Divisor Finder!");

    System.out.print("Enter first number: ");
    int x = sc.nextInt();
    System.out.print("Enter second number: ");
    int y = sc.nextInt();

    int gcd = 1; // Default GCD
    int min = Math.min(x, y); // Start from the smaller number

    for (int i = min; i >= 1; i--) { // Loop from smaller number to 1
      if (x % i == 0 && y % i == 0) {
        gcd = i;
        break; // Exit the loop once the GCD is found
      }
    }

    System.out.println("The greatest common divisor is " + gcd);

    sc.close(); // Close the scanner to free resources
  }
}
