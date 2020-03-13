package HackernoonJavaQuestions;

import java.util.Arrays;

public class SmallAndLargest {

    int smallest;
    int largest;

    public int smallestNumber(int[] values){
        Arrays.sort(values);
        smallest = values[0];
        return smallest;
    }

    public int largestNumber(int[] values){
        Arrays.sort(values);
        int size = values.length;
        largest = values[size-1];
        return largest;
    }

    public void smallAndLarge(int[] values){
        int smallest = values[0];
        int largest = values[0];

        for(int i = 0; i<values.length-1; i++) {
            if (values[i] < values[i+1]){
                smallest = values[i];
            }
            else if(values[i+1] > largest){
                largest = values[i+1];
            }
        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);

    }
}
