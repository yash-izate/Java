package Programs;

import java.util.Scanner;

public class AbsoluteValueofInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to absolute value of integer finder!");
    System.out.print("Please enter a integer number: ");
    int n = sc.nextInt();

    int absolute = (n >= 0) ? n : -n;
    System.out.println("Absolute value of given integer is " + absolute);
    sc.close();
  }

}
