package Methods;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Please enter your number : ");
        int num = sc.nextInt();
        int sum = sumFunction(num);
        System.out.println("Sum of digits is : " + sum);
        sc.close();
    }



public static int sumFunction(int num) {
    int sum = 0;

    while (num>0) {
        sum = sum + (num%10);
        num = num /10;        
    }
    return sum;
}

}