package GoldmanSacksPracticeHackernoon;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedString {

    public void firstNonRepeatedString(String word){

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        char[] wordArray = word.toCharArray();

        for(int i = 0; i<word.length(); i++){
            linkedHashMap.put(wordArray[i], linkedHashMap.containsKey(wordArray[i]) ? linkedHashMap.get(wordArray[i]) + 1: 1);
        }
        for(Map.Entry<Character, Integer> entry: linkedHashMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
