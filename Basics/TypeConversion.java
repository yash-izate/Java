package Basics;

public class TypeConversion {
  public static void main(String[] args) {

    // implicit or coercion - smaller into bigger datatype
    long big = 45;
    float dec = 3;
    double d = 3.01f;

    System.out.println("Implicit: " + big + "\n" + dec + "\n" + d);

    // explicit or casting - bigger into smaller (loss of some data)
    int num = (int) 3.14f;
    float bigNum = (float) 55.24566d;
    short integer = (short) 256;

    System.out.println("Explicit: " + num + "\n" + bigNum + "\n" + integer);

  }

}
