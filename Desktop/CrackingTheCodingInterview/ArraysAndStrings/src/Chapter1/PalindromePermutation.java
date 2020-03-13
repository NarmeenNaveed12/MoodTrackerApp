package Chapter1;

public class PalindromePermutation {


    public boolean checkPalindromePermutation(String word1, String word2){

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        if(word1Array.length == word2Array.length){

            return false;

        }

        return true;

    }
}
