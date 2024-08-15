package Loops;

import java.util.Scanner;

public class sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for n");
        int n = sc.nextInt();

        System.out.println("The sum of n numbers is : ");

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        sc.close();

    }

}
