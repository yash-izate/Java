package Arrays;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to array reversal !\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArr = new int[size];
        System.out.println("Enter the elements of array below : ");
        for (int i = 0; i < size; i++) {
            numArr[i] = sc.nextInt();
        }
        System.out.print("Original array : ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + "  ");
        }

        System.out.println();

        reverse(numArr);

        System.out.print("Reversed Array : ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + "  ");
        }
        sc.close();

    }

    public static void reverse(int[] numArr) {
        int i = 0;

        while (i < numArr.length / 2) {
            int swap = numArr[i];
            numArr[i] = numArr[numArr.length - 1 - i];
            numArr[numArr.length - 1 - i] = swap;
            i++;
        }
    }

}
