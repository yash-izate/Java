package Basics;

public class Variables {
  public static void main(String[] args) {

    //  1 byte = 8 bits  ,  -128 to 127
    byte b = 1;
    System.out.println("byte: " + b);
    
    // short = 2 byte
    short s = 2;
    System.out.println("short: " + s);
    
    //  int = 4 byte
    int i = 4;
    System.out.println("int: " + i);
    
    //  long = 8 byte
    long l = 8;
    System.out.println("long: " + l);
    
    //  float = 4 byte
    float f = 4.0f;
    System.out.println("float: " + f);
    
    // double = 8 byte
    double d = 8.0d; 
    System.out.println("double: " + d);
    
    // char = 2 byte
    char c = 't';
    System.out.println("char: " + c);

    //  boolean = 1 bit
    boolean bool = false;
    System.out.println("boolean: " + bool); 
    
    //  String = depend on assigned strings
    String name = "Hello World";
    System.out.println(name);
  }

}
