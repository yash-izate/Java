package Arrays;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter elements of an array : ");

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {

            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;

        }

        System.out.print("Reversed array : ");

        for (int element : arr) {

            System.out.print(element + " ");
        }

        sc.close();

    }

}
