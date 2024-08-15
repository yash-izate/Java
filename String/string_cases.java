// write a program to convert a string to lowercase and uppercase

package String;

import java.util.Scanner;

public class string_cases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String Name");
        String name = sc.nextLine();

        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Lower Case : " + name.toLowerCase());

        sc.close();

    }
}
