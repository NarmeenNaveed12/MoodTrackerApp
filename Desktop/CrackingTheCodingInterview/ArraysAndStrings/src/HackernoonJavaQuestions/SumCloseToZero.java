package HackernoonJavaQuestions;

public class SumCloseToZero {

    public void sumCloseToZero(int[] arr){
        int numberone = 0;
        int numbertwo = 0;
        int tempsum = arr[0] + arr[1];
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(Math.abs(sum) < Math.abs(tempsum)){
                    sum = (arr[i] + arr[j]);
                    numberone = arr[i];
                    numbertwo = arr[j];
                }
            }
        }
        System.out.println(numberone);
        System.out.println(numbertwo);
    }
}
