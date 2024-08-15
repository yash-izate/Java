package Recursion;

import java.util.Scanner;

public class factorial_n {

    static double fact(double x) {

        if (x == 0 || x == 1) {

            return 1;
        }

        double fact = x * fact(x - 1);

        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        double n = sc.nextInt();

        double result = fact(n);

        System.out.println("The factorial is : " + result);

        sc.close();
    }

}
