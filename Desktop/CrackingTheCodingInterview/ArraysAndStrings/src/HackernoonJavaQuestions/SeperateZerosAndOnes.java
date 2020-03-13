package HackernoonJavaQuestions;


public class SeperateZerosAndOnes {

    public void seperateZerosAndOnes(int[] arr){

        int[] array = new int[arr.length];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
           if(arr[i] == 0){
              count++;
            }
        }
        for(int j = 0; j<count; j++){
            arr[j] = 0;
        }

        for(int k = count; k<arr.length; k++){
            arr[k] = 1;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
