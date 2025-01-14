package Basics;

import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome To Password Checker!");

    String password;

    do {
      System.out.print("Please enter a valid password: ");
      password = sc.next();
    } while (!isValidPassword(password));

    System.out.println("Your password has been updated. \nThank You!");
    sc.close();
  }

  public static boolean isValidPassword(String password) {

    if (password.length() >= 8) {
      return true;
    } else {
      return false;
    }
  }

}