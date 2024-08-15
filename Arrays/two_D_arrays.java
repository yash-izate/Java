package Arrays;

import java.util.Scanner;

public class two_D_arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking size of 2D array
        System.out.println("Enter no. of rows in 2D array : ");
        int rows = sc.nextInt();

        System.out.println("Enter no. of columns in 2D array : ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // input of values in 2D array

        for (int i = 0; i < rows; i++) {

            System.out.printf("Enter elements of %d row : \n", i + 1);

            for (int j = 0; j < cols; j++) {

                array[i][j] = sc.nextInt();

            }
        }

        // output of values in 2D array

        System.out.println("The entered values are : ");

        for (int i = 0; i < rows; i++) {

            for (int j=0; j<  cols; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}



// package Arrays;

// public class two_D_arrays {
// public static void main(String[] args) {

// // row 0, 1 and col 0, 1, 2

// int[][] flats = new int[2][3];

// flats[0][0] = 101;
// flats[0][1] = 102;
// flats[0][2] = 103;
// flats[1][0] = 201;
// flats[1][1] = 202;
// flats[1][2] = 203;

// // displaying 2D array using for loop

// for (int i = 0; i < flats.length; i++) {

// for (int j = 0; j < flats[i].length; j++) {

// System.out.print(flats[i][j]);
// System.out.print(" ");

// }

// System.out.println();
// }

// }
// }
