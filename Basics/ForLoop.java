package Basics;

import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to prime number checker!");
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    boolean isPrime = isPrime(num);
    System.out.println("Your number is " + (isPrime ? "Prime" : "Not Prime"));
    sc.close();
  }

  public static boolean isPrime(int num) {

    for (int i = 2; i < num; i++) {

      if (num % i != 0) {
        return true;
      }

    }

    return false;
  }
}
