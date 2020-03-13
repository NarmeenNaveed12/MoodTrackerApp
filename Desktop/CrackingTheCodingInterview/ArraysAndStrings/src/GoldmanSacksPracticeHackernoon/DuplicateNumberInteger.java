package GoldmanSacksPracticeHackernoon;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberInteger {
    public int duplicateNumber(int[] numbers){
        int duplicate = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i = 0; i<numbers.length; i++){
            hashmap.put(numbers[i], hashmap.containsKey(numbers[i]) ? hashmap.get(numbers[i]) + 1: 1);
        }
        for(Map.Entry<Integer,Integer> entry: hashmap.entrySet()){
            if(entry.getValue() > 1){
                duplicate = entry.getKey();
            }
        }
        System.out.println(duplicate);
        return duplicate;
    }
}
