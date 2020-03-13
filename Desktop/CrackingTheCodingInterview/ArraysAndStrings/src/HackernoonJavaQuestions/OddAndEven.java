package HackernoonJavaQuestions;

import java.util.Arrays;

public class OddAndEven {

    public void oddAndEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (arr[left] % 2 == 0) {
                left++;
            }

            while (arr[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
