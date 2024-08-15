// package Methods;

// public class var_args {

//     static int sum(int... arr) {

//         // Available as int [] arr;

//         int result = 0;

//         for (int element : arr) {

//             result += element;
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
//         System.out.println("The sum of 4 and 5 and 6 is : " + sum(4, 5, 6));
//         System.out.println("The sum of 4 and 5 and 6 and 7 is : " + sum(4, 5, 6, 7));
//     }
// }


package Methods;

public class var_args {

    static int sum(int x, int... arr) {

        // Available as int [] arr;
        // we have to compulsory pass at least one argument

        int result = x;

        for (int element : arr) {

            result += element;
        }

        return result;
    }

    public static void main(String[] args) {


        System.out.println("The sum of only 1 is : " + sum(1));
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 4 and 5 and 6 is : " + sum(4, 5, 6));
        System.out.println("The sum of 4 and 5 and 6 and 7 is : " + sum(4, 5, 6, 7));
    }
}