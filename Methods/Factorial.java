package Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a positive number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        Fact f = new Fact();

        System.out.println("The factorial of number is : " + f.fact(n));
        sc.close();
    }

}

class Fact {

    public int fact(int x) {

        if (x == 1 || x == 0) {
            return 1;
        }

        return x * fact(x - 1);
    }
}
