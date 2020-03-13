package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class checkPermutation {

    private boolean isTrue = false;

    public checkPermutation() {

    }

    //worse TIME Comp
//    public boolean checkPermutationMethod(String word1, String word2) {
//        if (word1.length() == word2.length()) {
//            for (int i = 0; i < word1.length(); i++) {
//                for (int j = 0; j < word2.length(); j++) {
//                    if (word1.charAt(i) == word2.charAt(j)) {
//                        System.out.println(true);
//                        isTrue = true;
//                    }
//
//                }
//
//            }
//        }
//        System.out.println(isTrue);
//        return isTrue;
//
//    }


    //MY IMPLEMENTATIN

    public boolean checkPermutationMethod(String word1, String word2){
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        Arrays.sort(word1Array);
        System.out.println(word1Array);
        Arrays.sort(word2Array);
        System.out.println(word2Array);
        if(word1.length() != word2.length()){
            return false;
        }
        if(word1.length() == word2.length()){
            for(int i = 0; i<word1.length(); i++){
              if(word1Array[i] != word2Array[i]){
                  System.out.println(false);
                  return false;
               }
            }
        }

        System.out.println(true);
        return true;
    }
}

