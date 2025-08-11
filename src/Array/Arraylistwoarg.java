package Array;

import java.util.ArrayList;
import java.util.List;

public class Arraylistwoarg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 4};
        int target = 4;
//        System.out.println(find(arr, target, 0));
        System.out.println(findall(arr, target, 0));
    }

    static List<Integer> find(int[] arr, int target, int index) {

        List<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index + 1);
    }

    static List<Integer> findall(int[] arr, int target, int index){

        List<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        List<Integer> backadd = findall(arr, target, index+1);
        list.addAll(backadd);
        return list;
    }
}
