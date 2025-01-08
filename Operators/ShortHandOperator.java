package Operators;

import java.util.Scanner;

public class ShortHandOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    float x = sc.nextFloat();

    // x = x + 5;
    x += 10;

    // x = x - 5;
    x -= 5;

    // x = x * 50;
    x *= 50;

    // x = x / 2;
    x /= 2;

    //  x = x % 13;
    x %= 13;

    System.out.println(x);

    sc.close();

  }

}
