public class AddBinary {
    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        StringBuilder build = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while (i>=0 || j>=0 || carry==1){

            int aans = (i>=0)? a.charAt(i) - '0' : 0;
            int bans = (j>=0) ? b.charAt(j) -'0' : 0;

            int sum = carry + aans + bans;
            build.append(sum%2);
            carry = sum/2;

            i--;
            j--;

        }
        System.out.println(build.reverse().toString());


    }
}
