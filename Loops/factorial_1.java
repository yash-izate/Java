package Loops;

import java.util.Scanner;

// public class factorial_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();

//         int fact = 1;

//         for (int i = 1; i <= n; i++) {

//             fact = fact * i;

//         }

//         System.out.printf("The factorial  is = %d\n", fact);

//         sc.close();
//     }

// }

public class factorial_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int fact = 1;
        int i = 1;

        while (i <= n) {

            fact = fact * i;

            i++;

        }

        System.out.println("The factorial is : " + fact);

        sc.close();
    }
}
