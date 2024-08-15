// package Arrays;

// public class sum_matrix {
//     public static void main(String[] args) {

//         int[][] mat1 = { { 2, 4, 6 }, { 1, 3, 5 } };

//         int[][] mat2 = { { 1, 2, 3 }, { 7, 8, 9 } };

//         int[][] sum_mat = { { 0, 0, 0 }, { 0, 0, 0 } };

//         // row no. of times
//         for (int i = 0; i < mat1.length; i++) {

//             // columnn no. of times
//             for (int j = 0; j < mat1[i].length; j++) {

//                 System.out.printf(" Setting value for i = %d and j = %d\n", i, j);
//                 sum_mat[i][j] = mat1[i][j] + mat2[i][j];
//             }

//         }

//         // Printing sum of matrix
//         for (int i = 0; i < mat1.length; i++) {

//             for (int j = 0; j < mat1[i].length; j++) {

//                 System.out.print(sum_mat[i][j] + "  ");

//             }

//             System.out.println();

//         }

//     }

// }




package Arrays;

public class sum_matrix {
    public static void main(String[] args) {
        int[][] mat1 = { { 2, 4, 6 }, { 1, 3, 5 } };
        int[][] mat2 = { { 1, 2, 3 }, { 7, 8, 9 } };

        int[][] sum_mat = new int[mat1.length][mat1[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                sum_mat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int[] row : sum_mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
