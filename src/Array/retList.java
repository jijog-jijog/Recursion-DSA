package Array;

import java.util.ArrayList;
import java.util.List;

public class retList {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,8,4,9,4};
        int target = 11;
        List<Integer> ans = find(arr, target , new ArrayList<>(), 0);
        System.out.println(ans);
    }

    static List<Integer> find(int[] arr, int target, ArrayList<Integer> list, int index){

        if (index == arr.length){
           return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return find(arr,target, list , index+1);
    }
}
