package Loops;

import java.util.Scanner;

public class sum_even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                sum = sum + i;

            }
        }

        System.out.println("The sum of first n even numbers is : " + sum);

        sc.close();
    }

}
