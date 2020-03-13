package GoldmanSacksPracticeHackernoon;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicatePrint {

    public void stringDuplicate(String word){
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i = 0; i<word.length(); i++){
            hashMap.put(word.charAt(i), hashMap.containsKey(word.charAt(i)) ?
            hashMap.get(word.charAt(i)) + 1 : 0 );
        }

        for(Map.Entry<Character,Integer> entry: hashMap.entrySet() ){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
