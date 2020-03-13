package HackernoonStringQuestions;

public class FractionsGS {

    public void fractionGS(int[] array1, int[] array2){
        int denominator = 0;
        int numinator = 0;
        int gcd = 0;
        if(array1[1] == array2[1]){
        denominator = array1[1];
        }
        else{
            denominator = array1[1] * array2[1];
        }
        numinator = (denominator/array1[1])*array1[0] + (denominator/array2[1])*array2[0];
        System.out.println(numinator + "/" + denominator);
        for(int i  = 1; i <= numinator && i <= denominator; i++) {
            if (numinator % i == 0 && denominator % i == 0) {
                gcd = i;

            }
        }
            System.out.println(numinator/gcd + "/" + denominator/gcd );


    }
}
