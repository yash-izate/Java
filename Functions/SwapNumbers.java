package Functions;

import java.util.Scanner;

public class SwapNumbers {

  public static int userInput() {
    try (Scanner sc = new Scanner(System.in)) {
      return sc.nextInt();
    }
  }
  
  public static void swapNum(int x, int y) {
    int temp = x;
    x = y;
    y = temp;

    System.out.println("swapped a = " + x);
    System.out.println("swapped b = " + y);
    
  }
  
  public static void main(String[] args) {
    
    int a = userInput();
    int b = userInput();
    System.out.println("Org a = " + a);
    System.out.println("Org b = " + b);
    swapNum(a, b);

  }

}
