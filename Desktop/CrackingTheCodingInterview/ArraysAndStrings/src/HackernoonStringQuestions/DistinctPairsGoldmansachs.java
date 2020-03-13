package HackernoonStringQuestions;

import java.util.ArrayList;

public class DistinctPairsGoldmansachs {


    public void distinctPairs(int[] numbers, int k){
        int count = 0;
            for(int i = 0; i<numbers.length; i++){
                for(int j = i+1; j<numbers.length; j++){
                    int sum = numbers[i] + numbers[j];
                    if(Math.abs(sum) == k){
                        count++;
                        System.out.println(numbers[i] + " " + numbers[j]);
                    }

                }
            }
        System.out.println(count);


    }
}
