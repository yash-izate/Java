package OOPs;

class A {

    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of cass A");
    }
}

class B extends A {
    @Override

    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class method_Overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        b.meth3();
    }
}

/*
 * Theory - Method Overriding
 * 
 * Same Method Signature: The method in the child class must have the same name,
 * return type, and parameters as the method in the parent class.
 * 
 * Inheritance: Method overriding requires a superclass and a subclass
 * relationship.
 * 
 * Purpose: The main purpose of method overriding is to allow a subclass to
 * provide a specific implementation for a method that is already provided by
 * its parent class.
 */