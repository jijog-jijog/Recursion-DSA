public class primecount {
    public static void main(String[] args) { 
        int left = 6;
        int right = 10;
        int pricount = 0; 
        for (int i = left; i<=right; i++){
            int val = i;
            int count = 0;
            while(val > 0){
                if ((val&1)==1){
                count++;
                }
               val = val>>1;
            }
            if (isboolean(count)){

                pricount++;
            }

        }
        System.out.println(pricount);
    }
    static boolean isboolean(int n){
        if(n <= 1){
            return false;
        }
        for (int i =2; i*i<=n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
