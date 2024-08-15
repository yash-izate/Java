package Methods;

import java.util.Scanner;

class SumFunction {

    public int takeInput(Scanner sc) {
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        return n;
    }
    
    public int getSum(int n) {

        int i = 0;
        int sum = 0;
        
        while (i <= n) {
            
            sum = sum + i;
            i++;
        }
        return sum;
    }
}

public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SumFunction input = new SumFunction();
        
        int x = input.takeInput(sc);
        
        System.out.println("Sum of integers is : " + input.getSum(x));
        sc.close();
    }

}
