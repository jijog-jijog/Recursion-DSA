package Array;

import java.util.Arrays;

public class bubSor {
    public static void main(String[] args) {
        int[] arr ={1,11,55,33,12,1,3,34,99,67};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int e ){

        if (e == 0){
            return;
        }
        if (e > s){
            if (arr[s] > arr[s+1]){
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            sort(arr, s+1, e);
        }else{
            sort(arr, 0, e-1);
        }
    }
}
