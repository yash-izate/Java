package Arrays;

import java.util.*;

public class min_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array : ");

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        int max = arr[0];
        int min = arr[0];

        for (int element : arr) {

            if (max < element) {
                max = element;
            }
        }

        for (int element : arr) {

            if (min > element) {
                min = element;
            }
        }

        System.out.println("Greatest element : " + max);
        System.out.println("Smallest element : " + min);

        sc.close();
    }

}



// import java.util.Scanner;

// public class min_array {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter size of array: ");
// int size = sc.nextInt();

// int[] arr = new int[size];

// System.out.println("Enter elements of array: ");
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// int min = Integer.MAX_VALUE;

// for (int element : arr) {
// if (element < min) {
// min = element;
// }
// }

// System.out.println("The smallest element of array is: " + min);

// sc.close();
// }
// }
