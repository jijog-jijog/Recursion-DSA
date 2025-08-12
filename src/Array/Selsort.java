package Array;

import java.util.Arrays;

public class Selsort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,7,8,6};
        selection(arr,arr.length-1, 0, 0 );
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int end, int start, int max) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[max]) {
                selection(arr, end, start+1, start);
            } else {
                selection(arr, end, start+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;
            selection(arr, end-1, 0, 0);
        }
    }
}
