package Programs;

import java.util.Scanner;

public class GreatestOf3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Greatest Number Finder!");

    System.out.print("Enter first number: ");
    float num1 = sc.nextFloat();
    System.out.print("Enter second number: ");
    float num2 = sc.nextFloat();
    System.out.print("Enter third number: ");
    float num3 = sc.nextFloat();

    if (num1 > num2 && num1 > num3) {
      System.out.println(num1 + " is the greatest number.");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println(num2 + " is the greatest number.");
    } else {
      System.out.println(num2 + " is the greatest number.");
    }

    sc.close();
  }

}
