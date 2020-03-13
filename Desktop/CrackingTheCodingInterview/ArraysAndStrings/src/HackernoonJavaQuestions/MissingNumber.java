package HackernoonJavaQuestions;

public class MissingNumber {

    public int missingNumber(int[] arr){

        int total = (arr.length + 1) * arr.length / 2;
        int sum = 0;
        int missingnum;
        for(int i = 0; i<arr.length; i++){
                sum+=arr[i];
        }
        missingnum = sum - total;
        System.out.println(missingnum);
        return missingnum;
    }
}
