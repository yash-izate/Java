package Operators;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // AND & , OR | , XOR ^ , NOT ~ , Left Shift << , Right Shift >>

        System.out.println("Welcome to Bitwise Operator!");

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int and = x & y;
        System.out.println("AND: " + and);

        int or = x | y;
        System.out.println("OR: " + or);

        int xor = x ^ y;
        System.out.println("XOR: " + xor);

        int not = ~x;
        System.out.println("NOT: " + not);

        int leftShift = x << y;
        System.out.println("Left Shift: " + leftShift);

        int rightShift = x >> y;
        System.out.println("Right Shift: " + rightShift);

        sc.close();

    }

}