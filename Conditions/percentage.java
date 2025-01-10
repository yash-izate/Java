package Conditions;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("# Enter Marks Below out of 100\n");

        System.out.print("Enter marks in English : ");
        float s1 = sc.nextFloat();
        System.out.print("Enter marks in Physics : ");
        float s2 = sc.nextFloat();
        System.out.print("Enter marks in Chemistry : ");
        float s3 = sc.nextFloat();
        System.out.print("Enter marks in Maths : ");
        float s4 = sc.nextFloat();
        System.out.print("Enter marks in Electronics : ");
        float s5 = sc.nextFloat();

        float percentage = (s1 + s2 + s3 + s4 + s5) / 5;

        System.out.println("\nYour total percentage is " + percentage);

        if (percentage >= 35 && percentage <= 100) {
            System.out.println("You are Pass");
        } else if (percentage >= 0 && percentage < 35) {
            System.out.println("You are Fail");

        }

        else {
            System.out.println("Marks are Invalid");
        }

        sc.close();

    }
}
