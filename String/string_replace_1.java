// write a program to replace spaces with underscore in a string

package String;

import java.util.Scanner;

public class string_replace_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string name : ");
        String name = sc.nextLine();

        String replacement = name.replace(" ", "_");
        System.out.println("New String : " + replacement);

        sc.close();

    }
}
