package Basics;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    System.out.println("Enter your phone number: ");
    long mob = sc.nextLong();

    System.out.println("Enter your height in (feet, inches): ");
    float height = sc.nextFloat();

    System.out.println("Enter your net worth: ");
    double worth = sc.nextDouble();

    System.out.println("\n\nWelcome " + name + ".\n" + "Your age is: " + age + ".\n" + "Mobile No.: " + mob + "\n" + "Your height is " + height + ".\n" + "Your Bank Balance is " + worth + "\n\n" + "Thank You.");

    sc.close();

  }

}
