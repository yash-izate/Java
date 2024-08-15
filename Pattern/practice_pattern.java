package Pattern;

// ******
// ******
// ******
// ******
// ******

// public class practice_pattern {
//     public static void main(String args[]) {

//         int n = 5;
//         int m = 6;

//         for(int i = 1; i <= n; i++) {

//             for(int j = 1; j <= m; j++) {

//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }


// ******
// *    *
// *    *
// *    *
// ******

// public class Practice {
//     public static void main(String args[]) {

//         int n = 5;
//         int m = 6;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

//                 if (i == 1 || i == n || j == 1 || j == m) {

//                     System.out.print("*");

//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// *
// **
// ***
// ****
// *****

// public class Practice {
//     public static void main (String args[]) {

//         int n = 5;

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++) {

//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }


// *
// **
// ***
// ****
// *****

// public class practice_pattern {
//     public static void main(String[] args) {

//         int n = 5;
//         int i = 1;

//         while (i <= n) {
            
//             int j = 1;

//             while (j <= i) {

//                 System.out.print("*");

//                 j++;
//             }

//             System.out.println();

//             i++;
//         }

//     }
// }



// *****
// ****
// ***
// **
// *

// public class Practice {
//     public static void main(String args[]) {

//         int n = 5;

//         for(int i = n; i >= 1; i--) {

//             for(int j=1; j<=i; j++) {

//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//     }

// }



//     *
//    **
//   ***
//  ****
// *****

// public class Practice {
//     public static void main(String[] args) {

//         int n = 5;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {

//                 System.out.print(" ");

//             }

//             for (int j = 1; j <= i; j++) {

//                 System.out.print("*");

//             }

//             System.out.println();

//         }
//     }
// }



// *****
//  ****
//   ***
//    **
//     *

// public class Practice {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int i = n; i>=1; i--) {

//             for(int j = 1; j <= n -i; j++) {

//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i; j++) {

//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Practice {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int i = n; i>= 1; i--) {

//             for(int j = 1; j<= i; j++) {

//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// *
// * #
// * # *
// * # * #
// * # * # *
// * # * # * #
// * # * # * # *
// * # * # * # * #
// * # * # * # * # *
// * # * # * # * # * # 

// public class practice_pattern {
//     public static void main(String[] args) {

//         int n = 10;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= i; j++) {

//                 if (j % 2 == 0) {
//                      System.out.print(" # ");
//                 } else {
//                      System.out.print("*");
//                 }
//             }

//             System.out.println();

//         }

//     }
// }



//     *
//    * *
//   * * *
//  * * * *
// * * * * *


// import java.util.Scanner;

// public class practice_pattern {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows : ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {

//             for (int space = 1; space <= n - i; space++) {

//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= 2 * i - 1; j++) {

//                 System.out.print("*");

//             }

//             System.out.println();

//         }

//         sc.close();
//     }
// }

