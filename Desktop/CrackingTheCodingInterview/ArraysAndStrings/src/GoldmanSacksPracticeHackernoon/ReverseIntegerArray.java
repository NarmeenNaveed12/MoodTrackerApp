package GoldmanSacksPracticeHackernoon;
import java.util.ArrayList;

public class ReverseIntegerArray {

    public void reverseInteger(int[] numbers){

        ArrayList<Integer> arrayList = new ArrayList<>(numbers.length);

        for(int i=numbers.length; i>0; i--){
           arrayList.add(numbers[i - 1]);
        }
        System.out.println(arrayList);

    }
}
