package Pattern;

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows :");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns :");
        int column = sc.nextInt();
        
        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= column; j++) {

                if (i==1 || j==1 || i == row || j == column) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    sc.close();
    }
    
}
