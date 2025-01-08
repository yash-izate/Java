package Programs;

import java.util.Scanner;

public class PerimeterRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Calculate the perimeter of rectangle!");

    System.out.print("Enter length of rectangle (in m): ");
    float l = sc.nextFloat();

    System.out.print("Enter width of rectangle (in m): ");
    float w = sc.nextFloat();

    float perimeter = 2 * (l + w);

    System.out.printf("The Perimeter of rectangle whose length: %f m and width: %f m is %f m", l, w, perimeter);
    sc.close();

  }

}
