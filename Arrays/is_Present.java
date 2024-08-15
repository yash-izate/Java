package Arrays;

import java.util.Scanner;

public class is_Present {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] set_of = { 2, 3, 5, 7, 0 };

        System.out.println("Enter no. between (0-9)");
        int n = sc.nextInt();

        boolean is_there = false;

        for (int element : set_of) {

            if (n == element) {

                is_there = true;
                break;
            }
        }
        if (is_there) {

            System.out.println("Element is present in the array");

        } else {
            System.out.println("Element is not present in the array");
        }

        sc.close();
    }

}
