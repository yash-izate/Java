package Arrays;

public class arrays_types {
    public static void main(String[] args) {

        // There are 3 main ways to create an array in java.

        // 1.Declaration and then Memory allocation

        int[] marks;
        marks = new int[5];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30; // Initilization
        marks[3] = 40;
        marks[4] = 50;

        System.out.println(marks[0]);
        System.out.println();

        // to find length of array

        System.out.println("to find the length of array : " + marks.length);
        System.out.println();

        // 2.Declaration with memory allocation

        float[] student = new float[4];

        student[0] = 19.5f;
        student[1] = 20.8f;
        student[2] = 35.9f;
        student[3] = 80.7f;

        System.out.println(student[3]);
        System.out.println();

        // 3. Declaration with memory allocation and Initilization

        String[] city = { "Nagpur", "Pune", "Mumbai" };

        System.out.println(city[2]);

        System.out.println();

        // to print all arrays normally

        int n = marks.length;

        for (int i = 0; i < n; i++) {

            System.out.println(marks[i]);
        }

        System.out.println();

        //  to print arrays using for-each loop
        
        for (float element : student) {

            System.out.println("Array by for - each loop : " + element);
        }

        System.out.println();

        // another for each loop

        for (String element : city) {

            System.out.println(element);
        }

        System.out.println();

    }
}
