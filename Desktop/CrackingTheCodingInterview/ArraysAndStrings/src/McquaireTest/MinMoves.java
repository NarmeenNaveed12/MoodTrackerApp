package McquaireTest;

public class MinMoves {

    public void minMoves(int[] one, int[] two){
        char[] digitArray;
        char[] digitArrayTwo;
        for(int i = 0; i<one.length; i++ ){
                String digitForOne = String.valueOf(one[i]);
                String digitForTwo = String.valueOf(two[i]);
            digitArray = digitForOne.toCharArray();
            digitArrayTwo = digitForTwo.toCharArray();
            for(int j = 0; j<digitArray.length; j++){
                int sum = Math.abs(digitArray[j] - digitArrayTwo[j]);
                 sum+=Math.abs(digitArray[j+1] - digitArrayTwo[j+1]);
                System.out.println(sum);
            }

        }

    }
}
