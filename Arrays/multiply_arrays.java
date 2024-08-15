package Arrays;

public class multiply_arrays {
    public static void main(String[] args) {
        
        double[] number = {56.2233,234.343,3453.244,244.454,4.432};

        double result = 1;

        for (int i = 0; i<number.length; i++) {

            result = result * number[i];
        }

        System.out.println(result);
    }
}
