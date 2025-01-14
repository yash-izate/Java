package Basics;

import java.util.Scanner;

public class NestedTernaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Grade Finder!");
    System.out.print("Please enter your marks: ");
    float marks = sc.nextFloat();

    String grade = (marks >= 80) ? "High"
        : (marks < 80 && marks >= 50) ? "Moderate" : (marks >= 35 && marks < 50) ? "Low" : "Fail";
    System.out.println("Your Grade is " + grade);
    sc.close();
  }
}
