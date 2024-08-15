// package Recursion;

// import java.util.Scanner;

// public class sum_n {

//     static int sum(int x) {

//         if (x < 1) {

//             return 0;
            
//         }

//         return x + sum(x-1);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//         System.out.printf("The sum of first %d natural numbers are : %d\n", n, sum(n));

//         sc.close();
//     }
// }


// package Recursion;

// import java.util.Scanner;

// public class sum_n {
    
//     static int sum(int x) {
    
//         int sum = 0;

//         for (int i = 1; i <= x; i++) {
    
//             sum += i;
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//         System.out.printf("The sum of first %d natural numbers are : %d\n", n, sum(n));

//         sc.close();
//     }
// }



package Recursion;

public class sum_n {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
    
        printSum(1,5,0);
    }

}
