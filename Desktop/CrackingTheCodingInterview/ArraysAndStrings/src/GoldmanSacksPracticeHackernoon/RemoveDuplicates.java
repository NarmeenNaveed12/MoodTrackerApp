package GoldmanSacksPracticeHackernoon;

import java.util.HashSet;

public class RemoveDuplicates {

    public void removeDuplicates(int[] numbers){
        HashSet hashSet = new HashSet();

        for(int i = 0; i<numbers[i]; i++) {
            hashSet.add(numbers[i]);
        }

        System.out.println(hashSet);
    }
}
