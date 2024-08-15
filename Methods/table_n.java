package Methods;

import java.util.Scanner;

public class table_n {

    static void table(int x) {

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        table(n);

        sc.close();
    }

}
