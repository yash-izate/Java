package Arrays;

import java.util.Scanner;

public class searching_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of columns : ");
        int cols = sc.nextInt();

        // create a matrix in 2D array
        int[][] matrix = new int[rows][cols];

        // take input from user
        for (int i = 0; i < rows; i++) {
        
            System.out.printf("Enter elements of %d row : \n", i + 1);
        
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // output of matrix
        System.out.println("The given matrix is : \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search element
        System.out.println("\nEnter element to search in matrix : ");
        int x = sc.nextInt();
        boolean is_present = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (x == matrix[i][j]) {

                    is_present = true;
                    System.out.printf("The element is present in the matrix at index (Row = %d and Column = %d)", i + 1, j + 1);
                }
            }
        }

        if (!is_present) {
            System.out.println("\nThe element is not present in the matrix.");
        }
        sc.close();
    }
}



// package Arrays;

// import java.util.Scanner;

// public class searching_2D_Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int[][] matrix = new int[rows][cols];

//         // Take input from user
//         for (int i = 0; i < rows; i++) {
//             System.out.printf("Enter elements of row %d: \n", i + 1);
//             for (int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Output the matrix
//         System.out.println("The given matrix is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Search for element
//         System.out.print("\nEnter element to search in the matrix: ");
//         int x = sc.nextInt();

//         boolean isPresent = false;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (x == matrix[i][j]) {
//                     isPresent = true;
//                     System.out.printf("The element is present in the matrix at index (Row = %d, Column = %d)\n", i + 1, j + 1);
//                     break;
//                 }
//             }
//             if (isPresent) {
//                 break;
//             }
//         }

//         if (!isPresent) {
//             System.out.println("The element is not present in the matrix.");
//         }

//         sc.close();
//     }
// }
