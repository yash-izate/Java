//     *
//    * *
//   * * *
//  * * * *
// * * * * *

// package Pattern;

// import java.util.Scanner;

// public class pyramid_star {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows : ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n ; i++) {

//             for (int space = 1; space <= n - i; space++) {

//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i; j++) {

//                 System.out.print("*" + " " );

//             }

//             System.out.println();

//         }

//         sc.close();
//     }
// }



//     1
//    222
//   33333
//  4444444
// 555555555

// package Pattern;

// import java.util.Scanner;

// public class pyramid_star {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows : ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n ; i++) {

//             for (int space = 1; space <= n - i; space++) {

//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= 2 * i - 1; j++) {

//                 System.out.print(i);

//             }

//             System.out.println();

//         }

//         sc.close();
//     }
// }


//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 


package Pattern;

import java.util.Scanner;

public class pyramid_star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {

            for (int space = 1; space <= n - i; space++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(i + " " );

            }

            System.out.println();

        }

        sc.close();
    }
}


