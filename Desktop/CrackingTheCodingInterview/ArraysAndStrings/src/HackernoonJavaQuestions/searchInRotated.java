package HackernoonJavaQuestions;

public class searchInRotated {

    public int findValue(int[] arr,int high, int low,int number) {
        low = arr[0];
        high = arr[arr.length - 1];

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] <= arr[high]) {
                if (number > arr[mid] && number <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[low] < number && number < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
