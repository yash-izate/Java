package Programs;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Odd/Even Number Checker!");

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }

    sc.close();

  }

}



// import java.util.Scanner;

// public class BitwiseOperator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();

//         if ((num & 1) == 0) {
//             System.out.print("Number is Even");
//         } else {
//             System.out.println("Number is Odd");
//         }
//         sc.close();
//     }
// }
