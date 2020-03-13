package HackernoonJavaQuestions;

public class SumEqualToNumber {


    public void sumClosest(int[] arr, int number){
        int low = arr[0];
        int high = arr[arr.length - 1];
        int mid = 0;
        while (low <= high) {
             mid = low + ((high - low) / 2);
        }
        System.out.println(arr[mid]);


//        for(int i = low; i<high;i++){
//            for(int j = i+1; j<high; j++){
//                int sum = arr[i] + arr[j];
//                if((Math.abs(sum) > Math.abs(tempsum)) && (Math.abs(sum) < number) ){
//                    sum = (arr[i] + arr[j]);
//                    numberone = arr[i];
//                    numbertwo = arr[j];
//
//                }
//
//            }
//
//        }
//        System.out.println(numberone);
//        System.out.println(numbertwo);
    }
}
