package Arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Find Max and Min of Array !\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArr = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Maximum of the array is : " + max);
        System.out.println("Minimum of the array is : " + min);
        sc.close();
    }

    public static int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = numArr[0];
        int i = 1;

        while (i < numArr.length) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 1;

        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

}
