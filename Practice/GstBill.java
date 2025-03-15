package Practice;

import java.util.Scanner;

public class GstBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to GST Bill Maker!");
    System.out.print("Enter total number of items: ");
    int items = sc.nextInt();

    float[] prices = new float[items];

    for (int i = 0; i < items; i++) {
      System.out.print("Enter price and quantity for item " + (i + 1) + " (Price Quantity): ");
      if (sc.hasNextFloat() && sc.hasNextInt()) { // Input validation
        float cost = sc.nextFloat();
        int quantity = sc.nextInt();
        prices[i] = quantity * cost;
      } else {
        System.out.println("Invalid input! Please enter a valid price and quantity.");
        sc.next(); // Clear invalid input
        i--; // Retry for the same item
      }
    }

    float totalCost = 0;
    for (float price : prices) {
      totalCost += price;
    }

    float gst = totalCost * 0.18f;
    float finalAmount = totalCost + gst;

    System.out.printf("\n-----------------------------\n");
    System.out.printf("Product Cost:   Rs%.2f \n", totalCost);
    System.out.printf("GST (18%%):      Rs%.2f \n", gst);
    System.out.printf("Total Bill:     Rs%.2f \n", finalAmount);
    System.out.printf("-----------------------------\n");

    sc.close();
  }
}




// package Practice;

// import java.util.Scanner;

// public class GstBill {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Welcome to GST Bill Maker!");
// System.out.print("Enter total no. of items: ");
// int items = sc.nextInt();

// float[] price = new float[items];

// for (int i = 0; i < price.length; i++) {
// System.out.print("Enter " + (i + 1) + " product (Price-Quantity): ");
// float cost = sc.nextFloat();
// int quantity = sc.nextInt();

// price[i] = quantity * cost;

// }

// float sum = 0;

// for (float x : price) {
// sum += x;
// }

// float gst = sum * (0.18f);
// float bill = sum + gst;

// System.out.printf("Product cost: %f \nGST cost: %f \nTotal Bill: %f", sum,
// gst, bill);

// sc.close();
// }

// }
