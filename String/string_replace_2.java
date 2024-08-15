package String;

import java.util.Scanner;

public class string_replace_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = sc.nextLine();

        String letter = " Dear <name>, Thanks a lot.";

        String replace = letter.replace("<name>", name);
        System.out.println("New String : " + replace);
    
        sc.close();
    }
    
}
