package Functions;

import java.util.Scanner;

public class PrimeInRange {

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;

        }
        if (x == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) {
                return false;
            }
        return true;
    }

    public static void range(int l, int u) {
        System.out.print("Prime numbers in the range " + l + " and " + u + " are: ");

        for (int n = l; n <= u; n++) {
            if (isPrime(n)) {
                System.out.print(n + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter lower limit: ");
            int l = sc.nextInt();
            System.out.print("Enter upper limit: ");
            int u = sc.nextInt();
            range(l, u);
        } finally {
            sc.close();
        }
    }
}
