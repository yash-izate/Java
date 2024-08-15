package Pattern;

import java.util.Scanner;

public class palindrome_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // to print spaces 

            for (int space = 1; space <= n - i; space++) {

                System.out.print("  ");
            }

            // to print 1st half e.g. 4 3 2 1

                for (int j = i; j >= 1; j--) {

                    System.out.print(j + " ");
                }

                // to print 2nd half e.g. 2 3 4

                for (int k = 2; k <= i; k++) {

                    System.out.print(k + " ");

                }

            System.out.println();
        }

        sc.close();

    }
}