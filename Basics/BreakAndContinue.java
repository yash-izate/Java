package Basics;

public class BreakAndContinue {
  public static void main(String[] args) {
    System.out.println("Print Even Numbers!");

    int n = 1000;

    for (int i = 0; i <= n; i++) {
      if (i % 2 != 0) {
        continue;
      } else if (i == 100) {
        break;
      } else {
        System.out.println(i);
      }
    }

  }
}
