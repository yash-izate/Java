package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
  public static void main(String[] args) {

    int[] arr1 = { 1, 3, 5 };
    int[] arr2 = { 2, 4, 6, 8, 10 };

    int[] mergedArr = merge(arr1, arr2);
    System.out.println("Merged Array is " + Arrays.toString(mergedArr));

  }

  public static int[] merge(int[] arr1, int[] arr2) {
    int newSize = arr1.length + arr2.length;
    int[] newArr = new int[newSize];
    int i = 0, j = 0, k = 0;

    while (i < arr1.length || j < arr2.length) {
      if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
        newArr[k] = arr1[i];
        i++;
        k++;

      } else {
        newArr[k] = arr2[j];
        k++;
        j++;
      }

    }

    return newArr;
  }

}
