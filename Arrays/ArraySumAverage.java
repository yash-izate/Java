package Arrays;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to average calculator !\n");
        float[] numArray = ArrayUtility.inputArray();
        float sum = sum(numArray);
        float avg = average(numArray);

        System.out.println("Sum of array is : " + sum);
        System.out.println("Average of array is : " + avg);

    }

    public static class ArrayUtility {

        public static float[] inputArray() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array : ");
            int size = sc.nextInt();
            float[] array = new float[size];
            System.out.println("Enter the elements of array : ");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextFloat();
            }
            sc.close();
            return array;
        }

    }

    public static float sum(float[] numArray) {
        float sum = 0;

        for (float element : numArray) {
            sum = sum + element;
        }

        return sum;
    }

    public static float average(float[] numArray) {

        float sum = sum(numArray);

        float average = (float) sum / numArray.length;

        return average;
    }

}