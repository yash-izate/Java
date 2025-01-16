package OOPs.Polymorphism;

public class Overloading {
  
  public int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Overloading overload = new Overloading();

    System.out.println(overload.sum(11, 9));
  }
}
