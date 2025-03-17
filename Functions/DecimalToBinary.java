package Functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Decimal to Binary Converter!");
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

        System.out.println("Binary Number: " + binary.reverse());

        sc.close();
    }
}
