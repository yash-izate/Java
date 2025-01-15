package String;

import java.util.Scanner;

public class website_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter website url : ");
        String url = sc.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("Commersial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }

        sc.close();
    }
}
