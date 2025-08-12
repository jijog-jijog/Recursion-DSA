package Array;

public class patternTriangle {
    public static void main(String[] args) {
        int r = 1;
        int c = 0;

        pattern(r, c);

    }
    static void pattern(int r, int c){

        if (r == 0){
            return;
        }

        if (r > c){
            pattern(r+1, c);
            System.out.print("* ");
        }else{

           pattern(r-1, 0);
            System.out.println();
        }
    }
}
