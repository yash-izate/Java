package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Minimum and Maximum of Array Finder!");
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    if (size <= 0) {
      System.out.println("Please enter a valid size of array. \nExiting Program!!! ");
      sc.close();
      return;

    }

    float[] myArr = new float[size];
    for (int i = 0; i < myArr.length; i++) {
      System.out.printf("Enter %d element: ", i + 1);
      myArr[i] = sc.nextFloat();
    }
    System.out.println("User Array: " + Arrays.toString(myArr));

    float max = myArr[0];
    for (float element : myArr) {
      if (max < element) {
        max = element;
      }
    }

    float min = myArr[0];
    for (float element : myArr) {
      if (min > element) {
        min = element;
      }
    }

    System.out.println("Maximum of array is " + max);
    System.out.println("Mainimum of array is " + min);

    sc.close();

  }

}
