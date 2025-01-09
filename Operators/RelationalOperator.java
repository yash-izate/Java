package Operators;

import java.util.Scanner;

public class RelationalOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //  ==, !=, <=, >=, <, > 

    System.out.println("Welcome to Driving Liscense Center.");

    System.out.print("Please enter your age: ");
    int age = sc.nextInt();

    if (age < 18) {
      System.out.println("Sorry, You are Underage.");
    } else if (age > 60) {
      System.out.println("Sorry, You are Overage.");

    } else {
      System.out.println("Congratulation, You are eligible for driving liscense.");
    }
    sc.close();
  }
}
