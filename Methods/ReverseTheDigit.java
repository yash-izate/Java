package Methods;

import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Reverse the Digit !");
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("Reversed Number is :" + reverse);
        sc.close();
    }

    public static int reverse(int num) {
        int newNum = 0;

        while (num > 0) {

            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}

// ChatGpt -

// package Methods;

// import java.util.Scanner;

// public class ReverseTheDigit {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Welcome to Reverse the Digit !");
//         System.out.print("Enter your number: ");
//         int num = sc.nextInt(); // Read the input number
//         int reverse = reverse(num); // Call the reverse function
//         System.out.println("Reversed Number is: " + reverse); // Output the reversed number
//         sc.close(); // Close the scanner
//     }

//     public static int reverse(int num) {
//         int newNum = 0; // Initialize the variable to store the reversed number
//         boolean isNegative = num < 0; // Check if the number is negative

//         num = Math.abs(num); // Convert the number to its absolute value

//         // Loop to reverse the digits
//         while (num > 0) {
//             int digit = num % 10; // Get the last digit of the number
//             newNum = newNum * 10 + digit; // Append the digit to the new number
//             num /= 10; // Remove the last digit from the original number
//         }

//         // If the original number was negative, make the reversed number negative as well
//         return isNegative ? -newNum : newNum;
//     }
// }

