package Programs;

import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
    System.out.println("Welcome to Digit Sum Calculator!");

    int n = userInput();

    // to ensure n is positive for digit extraction
    n = Math.abs(n);

    int sum = 0;

    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n = Math.floorDiv(n, 10);

    }

    System.out.println("Sum of digit is " + sum);

  }

  public static int userInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.close();
    return n;
  }
}
