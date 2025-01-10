package Programs;

import java.util.Scanner;

public class MultiplyTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Print Table of Given Number");
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int i = 1;

    while (i <= 10) {

      System.out.printf("%d x %d = %d", n, i, n*i);
      System.out.println();
      i++;

    }
    sc.close();
  }

}
