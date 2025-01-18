package String;

import java.util.Scanner;

public class ConcatenateString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to String Concatenation!");
    System.out.print("Enter the number of strings to concatenate: ");
    int size = sc.nextInt();
    sc.nextLine(); // Consume the leftover newline character

    String[] strArray = new String[size];
    for (int i = 0; i < strArray.length; i++) {
      System.out.printf("Enter string %d: ", i + 1);
      strArray[i] = sc.nextLine();
    }

    System.out.println("Concatenated String: " + concatString(strArray));
    sc.close();
  }

  public static String concatString(String... s) {
    StringBuilder sum = new StringBuilder();

    for (String ele : s) {
      sum.append(ele).append(" ");
    }
    return sum.toString().trim(); // Trim to remove the trailing space
  }
}




// package String;

// import java.util.Scanner;

// public class ConcatenateString {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Welcome to String Concatenation!");
//     System.out.print("Enter number of string to concatenate: ");
//     int size = sc.nextInt();

//     String[] strArray = new String[size];
//     for (int i = 0; i < strArray.length; i++) {
//       System.out.printf("Enter string %d: ", i + 1);
//       strArray[i] = sc.next();
//     }

//     System.out.println(concatString(strArray));
//     sc.close();
//   }

//   public static String concatString(String... s) {
//     String sum = "";

//     for (String ele : s) {
//       sum = sum + ele + " ";

//     }
//     return sum;
//   }
// }
