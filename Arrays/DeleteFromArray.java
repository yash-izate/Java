package Arrays;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArr = new int[size];

        System.out.println("Enter elements of array below : ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number you want to delete : ");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array : ");
        for(int element : newArr) {
            System.out.print(element +  "  ");
        }
        sc.close();
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = OccurancesArray.noOfOccurances(numArr, numToDelete);

        if (occ == 0) {
            
            return numArr;
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;

        while (i < numArr.length) {
            if (numArr[i] != numToDelete ) {
                newArr[j] = numArr[i];
                j++;                
            }
            i++;
        }

        return newArr;
    }
}
