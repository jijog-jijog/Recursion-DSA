package Array;

public class findTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9};
        int target = 5;
        System.out.println(find1(arr, target, 0 ));
//        System.out.println(findind(arr, target, 0));

    }
    static boolean find1(int[] arr, int target, int index){

        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find1(arr , target, index+1);
    }

    static int findind(int[] arr, int target, int index){

        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else{
           return findind(arr, target, index+1);
        }
    }
}
