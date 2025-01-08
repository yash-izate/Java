package Basics;

public class EscapeSequences {
  public static void main(String[] args) {

    // \n next line after this
    System.out.println("1.*\n  * *\n  * * *\n  * * * *\n  * * * * *");

    // \t inserts a tab in the text at this point
    System.out.println("2. I live in\tIndia");

    // \b inserts a backspace in the text at this point (n is removed)
    System.out.println("3. Yeshwantrao Chavan\b College of Engineering");

    // \\ - inserts a backlash
    System.out.println("4. Where is address? 150\\2 Bus Stand");

    // \" - inserts a double quote character
    System.out.println("5. What is going in \"Class\" ");

    // \' - inserts a single quote character
    System.out.println("6. Hello \'Kitty\' ");

  }

}
