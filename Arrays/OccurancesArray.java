package Arrays;

import java.util.Scanner;

public class OccurancesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Array Occurances !\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArray = new int[size];

        System.out.println("Enter the elements of array below : ");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to find in the array: ");
        int num = sc.nextInt();

        int occurances = noOfOccurances(numArray,num);
        System.out.println("Your element was found " + occurances + " times in the array");
        sc.close();
    }

    public static int noOfOccurances(int[] numArray, int num) {
        int occ = 0;
        int i = 0;

        while (i<numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
