package Functions;

import java.util.Scanner;

public class PrimeFunction {

    public static int userInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            return sc.nextInt();
        }
    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        if (isPrime(userInput())) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
