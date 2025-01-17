/*Overloading constructors in Java refers to the practice of having multiple constructors in a single class, 
  each with a different parameter list. 
  This allows objects of the class to be instantiated in different ways depending on the constructor used.

 Key Points of Constructor Overloading

 1. Same Name, Different Parameters: All constructors must have the same name as the class but must differ in the number or type of parameters.

 2. Initialization Flexibility: Constructor overloading allows for different ways to initialize objects.

 3. Code Reusability: Reduces redundancy by allowing different initialization processes within the same class. 

*/

package OOPs;

class Rectangle1 {
    private int length;
    private int breadth;

    // Default constructor
    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    // Parameterized constructor
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class OverloadingConstructors {
    public static void main(String[] args) {

        // Creating an instance of Rectangle using the constructor without parameter
        Rectangle1 rec = new Rectangle1();

        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());

        // Creating an instance of Rectangle using the parameterized constructor
        Rectangle1 rc = new Rectangle1(2, 5);

        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}
