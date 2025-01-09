package Programs;

import java.util.Scanner;

public class IsLeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Leap Year Checker!");

    System.out.print("Enter the year: ");
    int year = sc.nextInt();

    if (year % 4 == 0 && year % 100 != 0) {
      System.out.println("It is a leap year.");
    } else if (year % 400 == 0) {
      System.out.println("It is a leap year.");
    } else {
      System.out.println("It is not a leap year.");
    }

    sc.close();
  }

}
