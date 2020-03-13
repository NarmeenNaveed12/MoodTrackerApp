package OnlineQuestions;

public class SmallAndLarge {

    public int smallNumber(int[] numbers){
        int x = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < x){
                x = numbers[i];
            }
        }
        System.out.println(x);
        return x;
    }

    public int largestNumber(int[] numbers){
        int x = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > x){
                x = numbers[i];
            }
        }
        System.out.println(x);
        return x;
    }


}
