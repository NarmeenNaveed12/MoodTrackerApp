package GoldmanSacksPracticeHackernoon;

import java.util.HashMap;
import java.util.Map;

public class MultipleDuplicatesNumber {

    public void duplicatesNumberMethod(int[] numbers){
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i<numbers.length; i++){
            hashMap.put(numbers[i], hashMap.containsKey(numbers[i]) ? hashMap.get(numbers[i]) + 1: 1);
        }
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue() > 1){
                count++;
                System.out.println(entry.getKey());
            }
        }

    }

}
