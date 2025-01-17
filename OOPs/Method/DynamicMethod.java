package OOPs.Method;

class Phone {

    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("My name is Java in class 1");
    }

}

class SmartPhone extends Phone {

    public void welcome() {
        System.out.println("You are Welcome");
    }

    public void name() {
        System.out.println("My name is Java in class 2");

    }

}

public class DynamicMethod {
    public static void main(String[] args) {

        // Phone p = new Phone();
        // SmartPhone sp = new SmartPhone();

        // sp.greet();

        Phone obj = new SmartPhone();

        obj.greet();

    }

}

// Theory 

// Dynamic method dispatch (also known as runtime polymorphism) is a mechanism
// by which a call to an overridden method is resolved at runtime, rather than
// at compile-time. This allows the program to decide which method
// implementation to execute based on the actual object type, even when the
// object is referenced by a superclass type variable.