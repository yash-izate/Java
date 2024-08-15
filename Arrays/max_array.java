package Arrays;

import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        // we can also initillize max with 1st element of array eg. arr[0]

        int max = Integer.MIN_VALUE;

        for (int element : arr) {

            if (element > max) {

                max = element;

            }
        }

        System.out.println("The greatest element in an array : " + max);

        sc.close();
    }
}