package OOPs;

class Animal {

    public void dog() {
        System.out.println("Bark");
    }

    public void cat() {
        System.out.println("Meow");
    }
}

class Birds extends Animal {

    public void bird() {
        System.out.println("Chirp");
    }

    public void snake() {
        System.out.println("Hiss");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Animal a = new Animal();

        Birds b = new Birds();

        a.cat();
        b.bird();
        b.snake();
    }

}

/* Theory - Inheritance 

 * Inheritance is a fundamental concept in object-oriented programming (OOP)
 * that allows one class (the subclass or derived class) to inherit the
 * properties and methods of another class (the superclass or base class). This
 * mechanism enables code reuse, simplifies maintenance, and allows for
 * polymorphic behavior.
 * 
 * In the provided code example, the class Animal is the superclass, and the
 * class Birds is the subclass that inherits from Animal.
 * 
 * Subclass (Derived Class) - Birds:
 * 
 * The Birds class extends the Animal class using the extends keyword, which
 * means it inherits all the properties and methods of the Animal class.
 * In addition to the inherited methods (dog() and cat()), the Birds class
 * defines two new methods: bird() and snake().
 * These methods print "Chirp" and "Hiss" respectively when called.
 */
