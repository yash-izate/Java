package Arrays;

import java.util.Scanner;

public class in_out_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int marks[] = new int[size];

        // Taking data from user - data input
        System.out.println("Enter elements of array : ");

        for (int i = 0; i < size; i++) {

            marks[i] = sc.nextInt();
        }

        // Giving output to the user
        System.out.print("The elements are : ");

        for (int j = 0; j < size; j++) {

            System.out.print(marks[j] + " ");
        }

        sc.close();

    }

}
