package Conditions;

import java.util.Scanner;

public class switch_case_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("# Enter Choice of Language");
        System.out.println(" 1.Hindi\n 2.English\n 3.French");
        System.out.print("Your Response : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Input");

        }
        sc.close();
    }

}
