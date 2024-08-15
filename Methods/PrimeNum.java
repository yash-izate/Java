package Methods;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Checker !!\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not Prime");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {

        int i = 2;

        while (i < num) {

            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}


// ChatGpt code :

// package Methods;

// import java.util.Scanner;

// public class PrimeNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Welcome to Prime Number Checker !!\n");
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();

//         if (isPrime(num)) {
//             System.out.println("The number is Prime");
//         } else {
//             System.out.println("The number is not Prime");
//         }
//         sc.close();
//     }

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
