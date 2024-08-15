package Conditional_Statement;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Leap Year");
        }

        else {
            System.out.println("Not a Leap year");
        }
        sc.close();
    }

}
