package Programs;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Fibonacci Series Calculator!");
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Here is the Fibonacci Series: ");
    printFibonacci(num);

    sc.close();
  }

  public static void printFibonacci(int num) {
    if (num < 0) {
      System.out.println("Invalid input. Please enter a non-negative number.");
      return;
    }
    if (num == 0) {
      System.out.println("0");
      return;
    }

    int first = 0, second = 1;
    System.out.print(first + " " + second);

    while (true) {
      int third = first + second;
      if (third > num) {
        break;
      }
      System.out.print(" " + third);

      first = second;
      second = third;
    }
    System.out.println();
  }
}