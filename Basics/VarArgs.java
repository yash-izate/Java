package Basics;

public class VarArgs {
  public static void main(String[] args) {

    int result = sum(2, 3, 4, 5, 7, 8, 9, 9);
    System.out.println("Sum result: " + result);

  }

  public static int sum(int first, int second, int... a) {
    int sum = 0;
    sum = first + second;
    for (int element : a) {
      sum += element;
    }

    return sum;
  }

}
