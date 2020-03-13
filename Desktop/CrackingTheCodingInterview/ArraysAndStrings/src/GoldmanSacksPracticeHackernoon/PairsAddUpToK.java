package GoldmanSacksPracticeHackernoon;

public class PairsAddUpToK {

    public void pairsAdd(int[] numbers, int k){

        int count = 0;
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                if((numbers[i] + numbers[j]) == k || numbers[j] - numbers[i] == k){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }

            }
        }
    }
}

