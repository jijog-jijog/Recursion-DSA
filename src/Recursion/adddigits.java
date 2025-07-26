package Recursion;

public class adddigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digicount(n));
    }
    static int digicount(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + digicount(n/10);
    }
}
