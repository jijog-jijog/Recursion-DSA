package Recursion;

public class count0s {
    public static void main(String[] args) {
        long n = 304000507;
        System.out.println(count(n));
    }
    static int count(long n){
        if (n==0){
            return 0;
        }

        int digi = (n%10 == 0) ? 1 : 0;

        return digi + count(n/10);

    }
}
