package HackernoonStringQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {


    public void duplicateChar(String word){
        char[] wordArr = word.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i <wordArr.length; i++){
            hashMap.put(wordArr[i], hashMap.containsKey(wordArr[i]) ? hashMap.get(wordArr[i]) + 1 : 1);
        }
        for(Map.Entry<Character, Integer> entry: hashMap.entrySet()){
           if(entry.getValue() > 1){
               System.out.println(entry.getKey());
           }
        }
    }
}

