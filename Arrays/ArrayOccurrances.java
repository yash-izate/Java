package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOccurrances {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Element Occurance Finder in Array!");
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    int[] myArr = new int[size];
    for (int i = 0; i < myArr.length; i++) {
      System.out.printf("Enter %d element: ", i + 1);
      myArr[i] = sc.nextInt();
    }

    System.out.println("User Array: " + Arrays.toString(myArr));
    System.out.print("Enter the number to find the occurances: ");
    int n = sc.nextInt();

    int counter = 0;
    for (int i = 0; i < myArr.length; i++) {
      if (n == myArr[i]) {
        counter++;
      } else {
        continue;
      }
    }

    System.out.printf("The number of occurances of %d in given array is %d", n, counter);
    sc.close();
  }

}
