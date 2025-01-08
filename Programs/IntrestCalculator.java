package Programs;

import java.util.Scanner;

public class IntrestCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Intrest Calculator!");

    System.out.print("Enter principal amount: ");
    double p = sc.nextDouble();

    System.out.print("Enter rate of intrest: ");
    float r = sc.nextFloat();

    System.out.print("Enter time period: ");
    int t = sc.nextInt();

    // to calculate compound intrest
    double cAmt = p * Math.pow((1 + r / 100), t);
    double CI = cAmt - p;
    System.out.println("Compound Intrest: " + CI);
    System.out.println("Total amount with compound intrest: " + cAmt);

    // to calculate simple intrest
    double SI = (p * r * t) / 100;
    double sAmt = p + SI;
    System.out.println("Simple Intrest: " + SI);
    System.out.println("Total amount with simple intrest: " + sAmt);

    sc.close();

  }
}
