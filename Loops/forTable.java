package Loops;

import java.util.Scanner;

public class forTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int table = n * i;

            System.out.printf("%d * %d = %d\n", n, i, table);
        }
        sc.close();
    }
}
