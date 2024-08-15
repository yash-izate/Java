package Loops;

import java.util.Scanner;

public class whileTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= 10) {

            int r = n * i;

            System.out.printf("%d x %d = %d\n", n, i, r);
            i++;
        }

        sc.close();
    }
}
