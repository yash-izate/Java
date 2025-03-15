package Practice;

import java.util.Scanner;

public class GstBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to GST Bill Maker!");
    System.out.print("Enter total no. of items: ");
    int items = sc.nextInt();

    float[] price = new float[items];

    for (int i = 0; i < price.length; i++) {
      System.out.print("Enter " + (i + 1) + " product (Price-Quantity): ");
      float cost = sc.nextFloat();
      int quantity = sc.nextInt();

      price[i] = quantity * cost;

    }

    float sum = 0;

    for (float x : price) {
      sum += x;
    }

    float gst = sum * (0.18f);
    float bill = sum + gst;

    System.out.printf("Product cost: %f \nGST cost: %f \nTotal Bill: %f", sum, gst, bill);

    sc.close();
  }

}
