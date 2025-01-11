package Arrays;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the size of the square matrix (only rows and columns need to be the same)
        System.out.print("Enter number of rows/columns for the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input elements for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter element for (%d,%d): ", i + 1, j + 1);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of diagonal elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];  // Sum for main diagonal
            if (i != n - i - 1) { // If it's not the same element, sum the anti-diagonal
                sum += matrix[i][n - i - 1];
            }
        }

        // Output the sum
        System.out.println("Sum of diagonal elements: " + sum);

        sc.close();
    }
}
