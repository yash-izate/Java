package Programs;

import java.util.Scanner;

public class ReverseDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Reversing the Digits of Number!");

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int tot = 0;

    while (num > 0) {
      int digit = num % 10;
      tot = tot * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed Number: " + tot);
    sc.close();
  }

}
