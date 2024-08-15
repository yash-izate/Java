package Arrays;

public class IsArraySorted {
    public static void main (String[] args) {

        int [] arr = {1,2,3,4,5,6};

        boolean is_sorted = true;

        for (int i = 0; i<arr.length -1; i++) {

            if (arr[i] > arr[i+1]) {

                is_sorted = false;
                break;
            }
            
        } 

        if (is_sorted) {

            System.out.println("The array is sorted");
            
        } else {
            
            System.out.println("The array is not sorted");
        }
    }
    
}
