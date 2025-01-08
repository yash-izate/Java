package Operators;

import java.util.Scanner;

public class NumberSwap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to Swapping Station!");
    
    System.out.print("Enter a: ");
    int a = sc.nextInt();

    System.out.print("Enter b: ");
    int b = sc.nextInt();

    int temp = a;
    a = b;
    b = temp;

    System.out.println("\na: " + a + "\t" + "b: " + b);

  }
  
}
