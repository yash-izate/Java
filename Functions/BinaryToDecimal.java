// package Functions;

// import java.util.Scanner;

// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Welcome to Binary to Decimal Converter!");
//         System.out.print("Enter binary number: ");
//         int n = sc.nextInt();

//         int sum = 0;

//         for (int i = 0; n > 0; i++) {

//             int digit = n % 10;

//             if (digit != 1 && digit != 0) {

//                 System.out.println("Invalid input! Please enter a binary number (only 0 and 1).");
//                 sc.close();
//                 return;
//             }

//             sum += digit * Math.pow(2, i);
//             n /= 10;

//         }

//         System.out.println("Decimal Number: " + sum);

//         sc.close();
//     }

// }




package Functions;

import java.util.Scanner;

public class BinaryToDecimal {

    public static boolean checkBinary(int digit) {
        if (digit != 1 && digit != 0) {
            System.out.println("Invalid input! Please enter a binary number (only 0 and 1).");
            return false;
        }
        return true;
    }

    public static void toDecimal(int n) {
        int sum = 0;
        int power = 0;

        while (n > 0) {
            int digit = n % 10;
            if (!checkBinary(digit)) {
                return;
            }
            sum += digit * (1 << power);
            n /= 10;
            power++;
        }

        System.out.println("Decimal Number: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Binary to Decimal Converter!");
        System.out.print("Enter binary number: ");
        int n = sc.nextInt();

        toDecimal(n);

        sc.close();
    }
}
