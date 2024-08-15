package OOPs;

class Cylinder1 {
    // Private member variables
    private int radius;
    private int height;

    // Constructor to initialize the radius and height
    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class constructors {
    public static void main(String[] args) {
        // Creating a Cylinder object with radius 6 and height 12
        Cylinder1 cyl = new Cylinder1(6, 12);

        // Printing the volume of the cylinder
        System.out.println("Volume of Cylinder = " + cyl.volume());

        // Printing the surface area of the cylinder
        System.out.println("Surface area of cylinder = " + cyl.surfaceArea());
    }
}

/*
 * Theory - Constructors
 * 
 * 1. Initialization: Constructors are special methods that are called when an
 * object is instantiated.
 * They are used to initialize the object's state (i.e., set the initial values
 * of its fields).
 * 
 * Same Name as Class: A constructor must have the same name as the class it
 * belongs to and does not have a return type, not even void.
 * 
 * Default Constructor: If no constructors are explicitly defined in a class,
 * Java provides a default no-argument constructor that initializes the object
 * with default values.
 * 
 * Overloading: Constructors can be overloaded, meaning a class can have
 * multiple constructors with different parameter lists to allow for different
 * ways of initializing objects.
 * 
 * Automatic Invocation: Constructors are automatically called when a new object
 * is created using the new keyword. They cannot be called explicitly like other
 * methods.
 * 
 */