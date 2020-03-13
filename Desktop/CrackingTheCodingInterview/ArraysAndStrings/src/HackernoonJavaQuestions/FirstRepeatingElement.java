package HackernoonJavaQuestions;

public class FirstRepeatingElement {
    public void repeatingElement(int[] arr){
        int number = arr[0];
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i] != number){
                number = arr[i];
            }
            else{
                number = arr[i];
                break;
            }
        }
        System.out.println(number);

    }
}
