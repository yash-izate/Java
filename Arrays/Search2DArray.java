package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome To 2D Array Searching!");

    System.out.print("Enter no. of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter no. of columns: ");
    int columns = sc.nextInt();

    int[][] numArray = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.printf("Enter element for (%d,%d): ", i + 1, j + 1);
        numArray[i][j] = sc.nextInt();
      }
    }
    System.out.println("User Array: " + Arrays.deepToString(numArray));
    System.out.print("Enter the element to search: ");
    int n = sc.nextInt();

    boolean isPresent = false;
    int i = 0, j = 0;

    outerLoop: for (i = 0; i < rows; i++) {
      for (j = 0; j < columns; j++) {
        if (numArray[i][j] == n) {
          isPresent = true;
          break outerLoop; // Breaks both loops
        }
      }
    }

    if (isPresent) {
      System.out.printf("Element is present at position (%d,%d) in array.\n", i + 1, j + 1);
    } else {
      System.out.println("Element not found in array.");
    }

    sc.close();
  }
}
