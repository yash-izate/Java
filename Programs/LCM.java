package Programs;

import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to LCM Calculator!");

    int x = userInput(sc);
    int y = userInput(sc);

    System.out.printf("LCM of (%d,%d) is %d", x, y, lcm(x, y));
    sc.close();

  }

  public static int userInput(Scanner sc) {
    System.out.print("Enter a number: ");
    return sc.nextInt();
  }

  public static int lcm(int first, int second) {
    int i = 1;

    while (true) {
      int factor = first * i;
      if (factor % second == 0) {
        return factor;
      }
      i++;
    }
  }
}
