package Programs;

import java.util.Scanner;

public class FahrenheitToCelcius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Temperature Degree Converter");

    System.out.print("Enter temperature in Fahrenheit: ");
    float fah = sc.nextFloat();

    float celcius = (fah - 32) * (5.0f / 9);

    System.out.println("Temperature in Celcius: " + celcius);
    sc.close();

  }

}
