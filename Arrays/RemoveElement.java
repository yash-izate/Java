// package Arrays;

// import java.util.Arrays;
// import java.util.Scanner;

// public class RemoveElement {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Welcome to Specific Element Removal from Array!");
//     System.out.print("Enter size of array: ");
//     int size = sc.nextInt();

//     int[] myArr = new int[size];
//     for (int i = 0; i < myArr.length; i++) {
//       System.out.printf("Enter %d element: ", i + 1);
//       myArr[i] = sc.nextInt();
//     }

//     System.out.println("User Array: " + Arrays.toString(myArr));
//     System.out.print("Enter the element to remove: ");
//     int n = sc.nextInt();

//     int counter = 0;
//     for (int i = 0; i < myArr.length; i++) {
//       if (n == myArr[i]) {
//         counter++;
//       }
//     }

//     int[] newArr = new int[size - counter];
//     int index = 0;

//     for (int element : myArr) {
//       if (element != n) {
//         newArr[index] = element;
//         index++;
//       }
//     }

//     System.out.println("Updated Array: " + Arrays.toString(newArr));
//     sc.close();

//   }
// }

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Specific Element Removal from Array!");

    // Input validation for array size
    int size;
    while (true) {
      System.out.print("Enter size of array: ");
      size = sc.nextInt();
      if (size > 0) {
        break;
      } else {
        System.out.println("Size must be a positive integer. Please try again.");
      }
    }

    int[] myArr = new int[size];
    for (int i = 0; i < myArr.length; i++) {
      System.out.printf("Enter %d element: ", i + 1);
      myArr[i] = sc.nextInt();
    }

    System.out.println("User Array: " + Arrays.toString(myArr));

    while (true) {
      System.out.print("Enter the element to remove: ");
      int n = sc.nextInt();

      // Count occurrences of the element to remove
      int counter = 0;
      for (int i = 0; i < myArr.length; i++) {
        if (n == myArr[i]) {
          counter++;
        }
      }

      if (counter == 0) {
        System.out.println("Element not found in the array. Please try again.");
        continue;
      }

      // Create a new array without the specified element
      int[] newArr = new int[size - counter];
      int index = 0;

      for (int element : myArr) {
        if (element != n) {
          newArr[index] = element;
          index++;
        }
      }

      System.out.println("Updated Array: " + Arrays.toString(newArr));

      // Ask user if they want to remove another element
      System.out.print("Do you want to remove another element? (yes/no): ");
      String choice = sc.next();
      if (!choice.equalsIgnoreCase("yes")) {
        System.out.println("Exiting program. Thank you!");
        break;
      }
    }

    sc.close();
  }
}
