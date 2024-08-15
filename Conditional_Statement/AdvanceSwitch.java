package Conditional_Statement;

import java.util.Scanner;

public class AdvanceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day no. 1-7 : ");
        int day = sc.nextInt();

        String DayStr = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday " + " Holiday";
            default -> "Invalid Input";
        };

        System.out.println(DayStr);

        sc.close();
    }
}
