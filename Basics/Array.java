package Basics;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {

    // Array is just list of values used for storing multiple values in a single
    // variable

    int[] myArr = new int[5];

    myArr[0] = 23;
    myArr[1] = -76;
    myArr[2] = 410;
    myArr[3] = 546;
    myArr[4] = 150 / 2;

    System.out.println(Arrays.toString(myArr));

  }

}
