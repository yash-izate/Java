package Methods;

import java.util.Scanner;

public class findLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int lcm = lcm(a, b);
        System.out.println("LCM of the two numbers is : " + lcm);
        sc.close();
    }

    public static int lcm(int x, int y) {
        int i = 1;

        while (true) {
            int factor = x * i;

            if (factor % y == 0) {

                return factor;
            }

            i++;
        }
    }
}
