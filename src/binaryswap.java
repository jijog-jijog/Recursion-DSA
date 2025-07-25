public class binaryswap {
    public static void main(String[] args) {
        int  n = 2147483644;
        int result = 0;



        for (int i = 0; i<32; i++) {
            int ans = (n&1);
            result = (result<<1) | (ans);
            n = n>>1;

        }
        System.out.println(result);


    }
}
