// GCD - Greatest Common Divisor

package Methods;

import java.util.Scanner;

public class findGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to G.C.D. Finder !!");
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int GCD = funGCD(num1, num2);
        System.out.println("The Greatest Common Divisor is : " + GCD);
        sc.close();
    }

    public static int funGCD(int x, int y) {
        int least = least(x, y);
        int gcd = 1;
        int i = 2;

        while (i <= least) {
            if (x % i == 0 && y % i == 0) {

                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
