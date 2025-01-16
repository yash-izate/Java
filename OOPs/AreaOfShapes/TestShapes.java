package OOPs.AreaOfShapes;

public class TestShapes {
  public static void main(String[] args) {
    // Shape shape = new Shaoe();

    Circle circle = new Circle(5);
    Square square = new Square(10.3);

    System.out.printf("Area of circle is %f\n", circle.calculateArea());
    System.out.printf("Area of square is %f", square.calculateArea());

  }
}
