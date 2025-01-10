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
      System.out.println("Invalid input. Try again!");
      return;
    }
    if (num == 0) {
      System.out.println("1");
      return;
    }

    int first = 0, second = 1;
    while (first + second <= num) {
      int third = first + second;
      System.out.print(" ");

      first = second;
      second = third;

    }

  }

}
