package Input_Output;



import java.util.Scanner;

public class addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int addition = num1 + num2;

        System.out.println(addition);

        sc.close();

    }
}
