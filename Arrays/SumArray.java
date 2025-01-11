package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Array Sum and Average Calculator!");
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    int[] myArr = new int[size];
    for(int i = 0; i < myArr.length; i++) {
      System.out.printf("Enter %d element: ", i+1);
      myArr[i] = sc.nextInt();
    }

    System.out.println("User array: " + Arrays.toString(myArr));

    int sum = 0;
    for (int element : myArr) {
      sum += element;
    }

    System.out.println("The Sum of Array is " + sum + " and its average is " + (sum/myArr.length) + ".");

    sc.close();
  }
}
