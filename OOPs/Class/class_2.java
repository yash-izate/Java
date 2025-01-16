package OOPs.Class;

class Square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {

    int length, breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Circle {

    float radius;

    public float area() {
        return 3.14f *radius*radius;
    }

    public float circumference() {
        return 2*3.14f*radius;
    }
}



public class class_2 {
    public static void main(String[] args) {

        // for square

        Square sq = new Square();

        sq.side = 5;

        System.out.println("Area of square is " + sq.area());
        System.out.println("Perimeter of square is " + sq.perimeter());

        // for rectangle

        Rectangle rt = new Rectangle();

        rt.length = 5;
        rt.breadth = 7;

        System.out.println("Area of rectangle is " + rt.area());
        System.out.println("Perimeter of rectangle is " + rt.perimeter());

        // for circle

        Circle crl = new Circle();

        crl.radius = 22.34f;

        System.out.println("Area of circle is " + crl.area());
        System.out.println("Circumference of circle is " + crl.circumference());

    }
}