package Loops;

import java.util.Scanner;

public class sum_table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int user_input;

        do {

            System.out.print("\n# Enter 1 to Run and 0 to Exit : ");
            user_input = sc.nextInt();

            if (user_input == 1) {

                System.out.print("\nEnter a number : ");
                int n = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= 10; i++) {

                    sum = sum + (n * i);

                }

                System.out.printf("The Sum of table of %d is = %d \n\n", n, sum);
            }
            else if (user_input != 0) {

                System.out.println("Invalid Input");
                
            }

        } while (user_input != 0);

        sc.close();
    }

}
