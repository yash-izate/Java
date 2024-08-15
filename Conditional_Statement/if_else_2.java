package Conditional_Statement;

import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : a ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : b ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("a is equal to b");
        }
        else if ( a > b) {
            System.out.println("a is greater than b");
        }
        else if ( a < b) {
            System.out.println("a is less than b");
        }

       sc.close(); 
    }

    
}
