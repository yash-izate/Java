package Arrays;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to array sorting !\n");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numArr = new int[size];

        System.out.println("Enter the element of array below :");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        
        if (isDec || isInc) {
            System.out.println("Your array is sorted.");
        } else {
            System.out.println("Your array is not sorted");
        }
        sc.close();

    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;

        while (i<numArr.length) {
            if (numArr[i] < numArr[i-1] ) {

                return false;
                
            }
            i++;
        }        
        return true;
    }
    
    public static boolean isDecreasing(int[] numArr) {
        int i  = 1;

        while (i<numArr.length) {
            if (numArr[i] > numArr[i-1]) {
                return false;                
            }
            i++;
        }
        return true;
    }
}
