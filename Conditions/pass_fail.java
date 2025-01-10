package Conditions;

import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("# Enter Marks out of 100\n");

        System.out.print("Enter marks in Physics : ");
        float phy = sc.nextFloat();
        System.out.print("Enter marks in Chemistry : ");
        float chem = sc.nextFloat();
        System.out.print("Enter marks in Maths : ");
        float math = sc.nextFloat();

        float total = (phy + chem + math) / 3.0f;

        if (phy >= 33 && chem >= 33 && math >= 33 && total >= 40) {

            System.out.printf("\nYour total percentage is %f\nYou are Pass.", total);
        } else
            System.out.printf("\nYour total percentage is %f\nYou are Fail.", total);

        sc.close();
    }

}
