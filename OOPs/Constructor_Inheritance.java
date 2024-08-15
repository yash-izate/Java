package OOPs;

class Base {

    public int x;

    Base() {
        System.out.println("I am a base class constructor");
    }

    Base(int x) {
        System.out.println("I am base class overloaded constructor with value of x : " + x);
    }

}

class Derived extends Base {

    public int y;

    Derived() {
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am derived class overloaded constructor with value of y : " + y);
    }

}

class Child extends Derived {

    public int z;

    Child() {
        System.out.println("I am child of derived class constructor");
    }

    Child(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a child of derived class overloaded constructor with value of z : " + z);
    }

}

public class Constructor_Inheritance {
    public static void main(String[] args) {

        // Base b = new Base();
        // Derived d = new Derived();
        // Derived c = new Derived(2,7);
        // Child ch = new Child();
        Child cd = new Child(3, 4, 6);

        System.out.println(cd.y);

    }
}

/*
 * Theory - Inheritance in constructors
 * 
 * Inheritance allows a class to inherit properties and methods from another
 * class.
 * Constructors in inherited classes are called in the order of inheritance,
 * starting from the base class.
 * Using super() in a subclass constructor calls the corresponding superclass
 * constructor.
 */
