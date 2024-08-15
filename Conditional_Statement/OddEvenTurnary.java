package Conditional_Statement;

import java.util.Scanner;

public class OddEvenTurnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Odd or Even detector ! ");
        System.out.print("Please enter your number : ");
        int num = sc.nextInt();

        String result = (num % 2 == 0)? "Even":"odd";
        System.out.println("Your number is : " + result);
        sc.close();
        
        
    }
}
