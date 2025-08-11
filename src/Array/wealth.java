package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class wealth {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        ArrayList<Boolean> setc = new ArrayList<>(Collections.nCopies(candies.length,false));

        int max = candies[0];
        for(int val : candies){
            if(val > max){
                max = val;
            }
        }

        for(int i =0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                setc.set(i,true);
            }
        }
        System.out.println(setc.toString());

    }
}
