package GoldmanSacksPracticeHackernoon;


import java.util.Arrays;

public class AnagramStrings {

    public void anagramStrings(String word1, String word2) {

        Boolean isAnagram = false;
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        Arrays.sort(word1Char);
        Arrays.sort(word2Char);
        for(int i = 0; i<word1Char.length; i++){
            for(int j = 0; j<word2Char.length; j++){
               if(word1Char[i] == word2Char[j]){
                   isAnagram = true;
               }
            }
        }
        System.out.println(isAnagram);
    }

}
