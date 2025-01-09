package Operators;

import java.util.Scanner;

public class LogicalOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // AND- &&, all conditions must be true
    // OR- ||, either condition must be true
    // NOT- !, inverts the boolean value of condition

    // They have lower priority than relational operator

    System.out.println("Welcome to Ticket Discount Calculator.");
    System.out.print("Please enter your age: ");
    int age = sc.nextInt();

    System.out.println("Are you a female? (true/false): ");
    Boolean isFemale = sc.nextBoolean();

    if (age < 5 || age > 60) {
      System.out.println("You got 75% discount!");
    } else if (isFemale) {
      System.out.println("You got 50% discount!");
    } else if (!isFemale) {
      System.out.println("You got 25% discount!");
    } else {
      System.out.println("You got no discount!");
    }

    sc.close();

  }

}
