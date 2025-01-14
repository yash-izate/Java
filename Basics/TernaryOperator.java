package Basics;

import java.util.Scanner;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Ternary Operator!");
    System.out.println("Please enter your age: ");
    int age = sc.nextInt();

    if (age >= 18) {
        System.out.println("Eligible");
    } else {
        System.out.println("Not Eligible");
    }
    String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
    System.out.println(eligibility);

    sc.close();

  }
}
