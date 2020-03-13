package OnlineQuestions;
import java.util.Arrays;
import java.util.HashMap;

// How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)
//NOT COMPLETED

public class MultipleDuplicates {

    public int[] multipleDuplicates(int[] numbers){
        int[] multipleDupsArray;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length - 1; i++){
            while(numbers[i] == numbers[i+1]){
                count++;
                i++;
                if(i + 1 == numbers.length){
                    break;
                }
            }
            hashMap.put(numbers[i], count);
        }
        hashMap.forEach((key,value) -> System.out.println(key + " = " + value));

//        for(int i = 0; i<numbers.length - 1; i++){
//            while (numbers[i] == numbers[i+1]){
//                i++;
//                if(i + 1 == numbers.length){
//                    break;
//                }
//                count++;
//                System.out.println(numbers[i] + "" + count);
//            }
//            hashMap.put(numbers[i], count);
//        }
        return null;
    }
}
