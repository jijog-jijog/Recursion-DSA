package Recursion;

public class recurclass {
    public static void main(String[] args) {
        int n = 5;
//        ftz(n);
        ztf(n);
    }
     static void ftz(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        ftz(n-1);
    }
    static void ztf(int n){
        if (n==0){
            return;
        }
        ztf(n-1);
        System.out.println(n);
    }
}
