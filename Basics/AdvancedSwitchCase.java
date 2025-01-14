package Basics;

import java.util.Scanner;

public class AdvancedSwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Month Finder using Advanced Switch Case!");
    System.out.print("Enter a number from (1 to 12) : ");
    int choice = sc.nextInt();

    String month = switch (choice) {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Invalid Input";
    };

    System.out.println(month);
    sc.close();

  }

}
