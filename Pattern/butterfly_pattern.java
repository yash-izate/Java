// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

package Pattern;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number or rows : ");
        int n = sc.nextInt()/2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for (int space = 1; space <= 2 * n - 2 * i; space++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for (int space = 1; space <= 2 * n - 2 * i; space++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();

            sc.close();
        }

    }

}
