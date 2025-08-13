package OOPs;

public class Swap {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 4;

        swap(a,b);

        System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }
}
