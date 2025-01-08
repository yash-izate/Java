package Operators;

public class OperatorPrecedence {
  public static void main(String[] args) {

    /*
     * 1. Parenthesis ()
     * 2. Exponents
     * 3. Multi * or Div /
     * 4. Add + or Sub -
     * 
     * If the operator of same presedence come together then Left to Right rule will
     * be applied.
     */

    System.out.println(9 / 3 * 2 / 6);
    System.out.println(9 / (3 * 2) / 6);

    System.out.println(8 - 5 + 7 - 1);
    System.out.println(8 - (5 + 7) - 1);
  }
}
