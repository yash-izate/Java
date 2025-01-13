package Basics;

import java.util.Scanner;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Ternary Operator!");
    System.out.println("Please enter your age: ");
    int age = sc.nextInt();

    boolean isEligible = (age >= 18) ? false : true;
    System.out.println();

    if (isEligible) {
      System.out.println("You are not eligible.");
    } else {
      System.out.println("You are eligible.");
    }

    sc.close();

  }
}
