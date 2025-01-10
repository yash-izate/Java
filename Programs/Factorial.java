package Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    System.out.println("Welcome to Factorial Calculator!");

    int n = userInput();
    BigInteger fact = factorial(n);

    System.out.println("Factorial of number: " + fact);

  }

  public static int userInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.close();
    return n;
  }

  public static BigInteger factorial(int x) {
    int i = 1;
    BigInteger fact = BigInteger.ONE;

    while (i <= x) {
      fact = fact.multiply(BigInteger.valueOf(i));
      i++;
    }
    return fact;
  }

}
