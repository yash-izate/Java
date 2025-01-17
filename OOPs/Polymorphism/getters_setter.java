package OOPs;

class Cylinder {

    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

}

public class getters_setter {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder();

        cyl.setRadius(6);
        cyl.setHeight(12);

        System.out.println("Volume of Cylinder = " + cyl.volume());
        System.out.println("Surface area of cylinder = " + cyl.surfaceArea());

    }

}

/*
 * Theory - Getters and Setters
 * 
 * Getters and Setters in Java: Key Points
 * Encapsulation:
 * 
 * Getters and setters help in achieving encapsulation by making fields private
 * and providing public methods to access and modify them.
 * Getter Methods (Accessors):
 * 
 * Used to retrieve or access the value of a private field.
 * Naming convention: getFieldName(), e.g., getLength().
 * Ensures read-only access if no corresponding setter is provided.
 * Setter Methods (Mutators):
 * 
 * Used to modify or set the value of a private field.
 * Naming convention: setFieldName(type value), e.g., setLength(int length).
 * Allows for controlled modification with potential validation.
 * Data Validation:
 * 
 * Setters can include logic to validate the input before assigning it to the
 * field.
 * Helps maintain the integrity and correctness of the object's state.
 * Consistency and Maintainability:
 * 
 * Centralizes the logic for accessing and modifying fields, making the code
 * easier to maintain and update.
 * Ensures consistent use and modification of fields throughout the codebase.
 * 
 */