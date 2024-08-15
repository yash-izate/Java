package OOPs;

// Class For Problem 1

class Employee {

    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

// Class For Problem 2
class CellPhone {

    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void call() {
        System.out.println("Calling SM...");
    }

    public void message() {
        System.out.println("Messaging...");
    }

}


public class class_1 {
    public static void main(String[] args) {

        // Problem 1

        Employee yash = new Employee();

        yash.setName("Yash Izate");
        System.out.println("My name is " + yash.getName());
        
        yash.salary = 120000;
        System.out.println("My Salary is " + yash.getSalary());

        // Problem 2

        CellPhone moto = new CellPhone();

        moto.ring();
        moto.vibrate();
        moto.call();
        
    }

}
