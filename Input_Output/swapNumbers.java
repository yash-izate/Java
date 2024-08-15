package Input_Output;

import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Welcome to swapping station\"");

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Original a = " + a);
        System.out.println("Original b = " + b);

        System.out.println();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapping Done !");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();

    }

}
