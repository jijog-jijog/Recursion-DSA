package Recursion;

public class incrementoperator {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(count(n));
    }
    static int count(int n){
        if (n == 0){
            return 0;
        }
        System.out.println(n);
        return count(n--);

    }
}
