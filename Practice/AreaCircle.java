package Practice;

import java.util.Scanner;

public class AreaCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to area calculator of circle!");
    System.out.print("Enter radius of circle: ");
    float rad = sc.nextFloat();

    float area = (float) (Math.PI * Math.pow(rad, 2));

    System.out.println("Area of circle is " + area);
    sc.close();
  }
  
}
