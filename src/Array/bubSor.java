package Array;

import java.util.Arrays;

public class bubSor {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 0, 3};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int e, int s) {
        // Base case: If end index is 0, array is sorted
        if (e == 0) {
            return;
        }

        // If we haven’t reached the end of this pass
        if (s < e) {
            if (arr[s] > arr[s + 1]) {
                int temp = arr[s];
                arr[s] = arr[s + 1];
                arr[s + 1] = temp;
            }
            // Move to the next element in this pass
            bubble(arr, e, s + 1);
        } else {
            // Start a new pass, reduce end boundary
            bubble(arr, e - 1, 0);
        }
    }
}
