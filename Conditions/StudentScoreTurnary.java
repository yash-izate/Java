package Conditions;

import java.util.Scanner;

public class StudentScoreTurnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to students grade finder !");
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        String grade = (marks >= 80) ? ("Grade: A") : ((marks >= 50) ? "Grade : B" : "Grade : C");
        System.out.println(grade);
        sc.close();

    }
}
