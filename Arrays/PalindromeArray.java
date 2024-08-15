package Arrays;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker !\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArr = new int[size];
        System.out.println("Enter the elements of array below : ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is Palindrome.");
            
        } else {
            System.out.println("Your array is not Palindrome");
        }
        sc.close();

    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i<numArr.length /2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                
                return false;
            }  
            i++;          
        }
        return true;
    }

}
