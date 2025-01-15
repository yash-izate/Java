package Basics;

class ToString {

  String name;
  int age;
  String rollNumber;
  String house;

  public ToString(String name, int age, String rollNumber, String house) {
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.house = house;
  }

  @Override
  public String toString() {
    return "Students Details: {name: " + name + ", age: " + age + ", roll number: " + rollNumber + ", house: " + house
        + "}";
  }
public static void main(String[] args) {
  ToString stu = new ToString("Yash", 21, 70, "blue");
}
}
