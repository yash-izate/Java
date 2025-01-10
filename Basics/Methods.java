package Basics;

public class Methods {

  public static void printWelcome() {

    System.out.println("Welcome to Methods or Functions in Java!");
  }

  public static int printSum(int x, int y) {

    int sum = x + y;
    return sum;
  }

  public static void main(String[] args) {

    printWelcome();

    int a = 10;
    int b = 20;

    int sum =  printSum(a,b);

    System.out.println("Sum: " + sum);

  }

}
