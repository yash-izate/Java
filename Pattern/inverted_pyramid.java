// * * * * *
//  * * * *
//   * * *
//    * *
//     *

package Pattern;

import java.util.Scanner;

public class inverted_pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1 ; i--) {

            for (int space = 1; space <= n - i; space++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        sc.close();
    }
}
