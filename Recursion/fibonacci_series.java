package Recursion;

import java.util.Scanner;

public class fibonacci_series {

    static int fibo(int x) {

        if (x == 0) {

            return 0;

        } else if (x == 1) {

            return 1;
        }

        return fibo(x - 1) + fibo(x - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of terms : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series : ");

        for (int i = 0; i <= n; i++) {

            System.out.print(fibo(i) + " ");
        }

        sc.close();
    }

}
