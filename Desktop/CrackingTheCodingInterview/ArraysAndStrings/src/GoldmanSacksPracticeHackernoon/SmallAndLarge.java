package GoldmanSacksPracticeHackernoon;

public class SmallAndLarge {

    public void smallAndLarge(int[] numbers){
        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
