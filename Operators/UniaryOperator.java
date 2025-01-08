package Operators;

public class UniaryOperator {
  public static void main(String[] args) {

    // change the sign of value (-)
    int x = 5;
    int y = -x;
    System.out.println(y);

    // Pre Increment: ++a
    int a = 1;
    int p = a++ + a++;
    System.out.println(p);

    // Post Increment: b++
    int b = 1;
    int q = ++b + ++b;
    System.out.println(q);

    // Pre Decrement: --k
    int k = 1;
    int m = --k + --k;
    System.out.println(m);

    // Post Decrement: l--
    int l = 2;
    int n = l-- + l--;
    System.out.println(n);

  }

}
