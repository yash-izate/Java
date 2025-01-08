package Operators;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.print("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
