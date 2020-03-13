package HackernoonStringQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {

    public void firstNonRepeated(String word){
        char[] array = word.toCharArray();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0; i<array.length; i++){
          hashMap.put(array[i], hashMap.containsKey(array[i]) ? hashMap.get(array[i]) + 1 : 1);
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
                break;
            }
        }

    }
}
