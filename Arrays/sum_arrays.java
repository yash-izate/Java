package Arrays;

public class sum_arrays {
    public static void main(String[] args) {

        float[] marks = { 10.5f, 20.8f, 30.6f, 40.7f, 50.1f };

        float sum = 0;

        for (float element : marks) {

            sum = sum + element;
        }

        System.out.println("The sum of marks is : " + sum);

    }

}
