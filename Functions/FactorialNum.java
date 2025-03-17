package Functions;

public class FactorialNum {

    public static int fact(int x) {
        if (x == 1) {
            return 1;
        }

        int fact = 1;

        for (int i = x; i > 0; i--) {
            fact *= i;

        }

        return fact;

    }

    public static void main(String[] args) {

        int n = 10;
        long result = fact(n);

        System.out.println(result);
    }
}
