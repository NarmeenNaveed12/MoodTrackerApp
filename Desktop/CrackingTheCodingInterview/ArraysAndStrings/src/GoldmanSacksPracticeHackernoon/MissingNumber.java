package GoldmanSacksPracticeHackernoon;

import java.util.Arrays;

public class MissingNumber {


    public void missingNumber(int[] integerArray){
        Arrays.sort(integerArray);
        int missing = 0;
        for(int i = 0; i<integerArray.length; i++){
            if(integerArray[i] == i+1){
                System.out.println(integerArray[i]);
            }
            else{
                missing = i+1;
            }
        }
        System.out.println("missing" + missing);
    }
}
