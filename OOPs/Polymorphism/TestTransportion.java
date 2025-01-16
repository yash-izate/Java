package OOPs.Polymorphism;

public class TestTransportion {
  public static void main(String[] args) {

    // Parent object
    Vehicle v = new Vehicle();
    // Child object
    Car c = new Car();
    Plane p = new Plane();

    // it is valid becoz every car is a vehicle. and Vehicle is a parent class.
    // Vehicle vCar = new Car();

    castTest(v);
    castTest(c);
    castTest(p);

  }

  public static void castTest(Vehicle veh) {
    veh.start();
  }
}
