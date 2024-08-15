package Conditional_Statement;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income : ");
        float income = sc.nextFloat();

        float tax = 0;

        if (income <= 250000) {

            tax = tax + 0;
            System.out.println("Income tax is : " + tax);

        } else if (income > 250000 && income <= 500000) {

            tax = tax + 0.05f * (income - 250000);
            System.out.println("Income tax is : " + tax);

        } else if (income > 500000 && income <= 1000000) {

            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.1f * (income - 500000);
            System.out.println("Income tax is : " + tax);

        } else if (income > 1000000) {

            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.1f * (income - 500000);
            tax = tax + 0.3f * (income - 1000000);
            System.out.println("Income tax is : " + tax);

        }

        sc.close();
    }

}