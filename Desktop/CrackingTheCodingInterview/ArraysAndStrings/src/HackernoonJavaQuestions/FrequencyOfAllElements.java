package HackernoonJavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAllElements {

    public void frequencyOfElements(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            hashMap.put(arr[i], hashMap.containsKey(arr[i]) ? hashMap.get(arr[i]) + 1: 1);
        }
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println("Frequency of " + entry.getKey() + "is" + entry.getValue());
        }
    }
}
