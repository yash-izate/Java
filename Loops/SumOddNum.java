package Loops;

import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {

            if ((i & 1) != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }

}
