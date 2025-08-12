package Sorting;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr = {11,44,67,33,23,14,9,1,4,2};
        int[] ar = mergeSort(arr);
        System.out.println(Arrays.toString(ar));
    }
    static int[] mergeSort(int[] arr){

        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){

        int[] mer = new int[left.length + right.length];

        int i =0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length){

            if (left[i] < right[j]){
                mer[k] = left[i];
                i++;
            }else {
                mer[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            mer[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mer[k] = right[j];
            j++;
            k++;
        }

        return mer;
    }
}
