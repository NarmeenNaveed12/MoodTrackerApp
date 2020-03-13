package HackernoonJavaQuestions;

import java.util.Arrays;

public class SecondLargestNumber {

    public int secondLargestNumber(int[] arr){

        Arrays.sort(arr);
        int number = 0;
            if (arr[arr.length-1] != arr[arr.length-2]) {
                number = arr[arr.length-2];
            }
        System.out.println(number);
        return number;

    }
}
