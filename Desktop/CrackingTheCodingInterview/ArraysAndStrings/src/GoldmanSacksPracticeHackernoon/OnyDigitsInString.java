package GoldmanSacksPracticeHackernoon;

public class OnyDigitsInString {

    public void onlyDigits(String word){
        if(word.matches("^[0-9]*$")){
            System.out.println(true);
        }
    }
}
