package Basics;

import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to our Division Calculator!");
    System.out.print("Enter your Dividend: ");
    int x = sc.nextInt();
    System.out.print("Enter your Divisor: ");
    int y = sc.nextInt();
    sc.close();

    try {
      int result = x / y;
      System.out.printf("Result is %d", result);
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero is invalid!!!");
    } catch (Throwable th) {
      System.out.println("General Exception");            // it catches all the exceptions
    } finally {
      System.out.println("I am in finally!");             // it runs regardless of try and catch
    }
  }
}
