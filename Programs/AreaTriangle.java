package Programs;

import java.util.Scanner;

public class AreaTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Area Calculator of Triangle!");

    System.out.print("Enter base of triangle: ");
    float base = sc.nextFloat();

    System.out.print("Enter height of triangle: ");
    float height = sc.nextFloat();

    double area = (0.5 * base * height);

    System.out.println("Area of triangle: " + area);
    sc.close();
  }

}
