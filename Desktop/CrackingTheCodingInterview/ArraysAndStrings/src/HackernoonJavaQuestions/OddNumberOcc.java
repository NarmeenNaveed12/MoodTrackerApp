package HackernoonJavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class OddNumberOcc {

    public int oddNumOcc(int[] arr){
        int number = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<arr.length; i++){
            hashMap.put(arr[i], hashMap.containsKey(arr[i]) ? hashMap.get(arr[i]) + 1 : 1);
        }
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue()%2 == 1){
                number = entry.getKey();
            }
        }
        System.out.println(number);
        return number;
    }
}
