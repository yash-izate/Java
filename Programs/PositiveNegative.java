package Programs;

import java.util.Scanner;

public class PositiveNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Positive Negative Number Checker!");
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num == 0) {
      System.out.println("Number is Zero");
    } else if (num < 0) {
      System.out.println("Negative Number");
    } else {
      System.out.println("Positive Number");
    }
    sc.close();
  }
}