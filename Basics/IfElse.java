package Basics;

public class IfElse {
  public static void main(String[] args) {

    // If Else condition
    boolean isMale = true;
    isMale = false;
    String name = "Kiran";

    System.out.println("Before If");
    if (isMale) {
      System.out.println("Mr " + name);

    } else {
      System.out.println("Mrs " + name);
    }

    System.out.println("After If");

    // If-Else Ladder
    boolean isSeniorCitizen = true;
    boolean isAdult = false;

    if (isSeniorCitizen) {
      System.out.println("Hello, Senior Citizen!");

    } else if (isAdult) {
      System.out.println("Hello, Adult!");

    } else {
      System.out.println("Hello, Child!");
    }

  }
}
