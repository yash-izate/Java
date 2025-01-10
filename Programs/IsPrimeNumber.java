package Programs;

import java.util.Scanner;

public class IsPrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Welcome to Prime Number Checker!");
      System.out.print("Enter a number: ");
      int n = sc.nextInt();

      if (n <= 1) {
        System.out.println("Not a Prime Number");
      } else if (isPrime(n)) {
        System.out.println("Prime Number");
      } else {
        System.out.println("Not a Prime Number");
      }
    } finally {
      sc.close();
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false; // Numbers <= 1 are not prime
    }
    for (int i = 2; i <= Math.sqrt(n); i++) { // Loop only up to √n
      if (n % i == 0) {
        return false; // If divisible, it's not prime
      }
    }
    return true; // Prime if no divisors found
  }
}
