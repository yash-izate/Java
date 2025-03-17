package Functions;

public class BinomialCoefficient {

    public static long fact(int x) {
        long fact = 1;

        int i = 1;
        while (i <= x) {

            fact *= i;
            i++;
        }

        return fact;
    }

    public static long binCoeff(int n, int r) {
        long result = fact(n) / (fact(r) * fact(n - r));
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        long result = binCoeff(n, r);

        System.out.println("Binomial Coefficient: " + result);

    }
}
