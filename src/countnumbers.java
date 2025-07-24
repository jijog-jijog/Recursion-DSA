public class countnumbers {
    public static void main(String[] args) {
        String allowd = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int count = 0;

        for (String a : words){
            if (allowd.contains(a)){

                count++;
            }
        }
        System.out.println(count);
    }
}
