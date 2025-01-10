package Programs;

import java.util.Scanner;

public class SumOddNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Odd Number Sum Calculator!");
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    int i = 1;
    int sum = 0;

    while (i <= n) {

      System.out.println(i);
      sum += i;
      i = i + 2;
    }

    System.out.println("Sum of odd number is " + sum);
    sc.close();
  }

}
