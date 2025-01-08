package Operators;

import java.util.Scanner;

public class UserSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Calculator!");

    System.out.print("Enter first number: ");
    int firstNum = sc.nextInt();

    System.out.print("Enter second number: ");
    int secondNum = sc.nextInt();

    int sum = firstNum + secondNum;

    System.out.println("Your sum is " + sum + "\nThank You");
    sc.close();

  }

}
