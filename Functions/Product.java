package Functions;

public class Product {

  public static void product(int a, int b) {
    int product = a * b;
    System.out.println("Product of " + a + " and " + b + " is " + product);
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 10;

    product(a, b);

  }
}
