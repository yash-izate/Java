package Conditional_Statement;
import java.util.Scanner;
public class Ternary_Operator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Checker !");
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

       int greatestNum =  (a>b)? a:b;
       System.out.println("The greatest number is : " + greatestNum);
       sc.close();
    }

    
}
