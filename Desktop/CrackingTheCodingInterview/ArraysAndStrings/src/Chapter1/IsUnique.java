package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class IsUnique {

    private Boolean isTrue = false;

    public IsUnique() {

    }

    //This has bad time complexity

//    public boolean isUniqueMethod(String word) {
//
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = i + 1; j < word.length(); j++) {
//                if (word.charAt(i) == word.charAt(j)) {
//                    isTrue = true;
//                }
//            }
//        }
//        System.out.println(isTrue);
//        return isTrue;
//    }

    //good time complexity
//    public boolean isUniqueMethod(String word) {
//
//        char[] chArray = word.toCharArray();
//        System.out.println(chArray);
//        Arrays.sort(chArray);
//        System.out.println(chArray);
//
//
//        for (int i = 0; i < chArray.length - 1; i++) {
//            // if the adjacent elements are not
//            // equal, move to next element
//            if (chArray[i] != chArray[i + 1])
//                continue;
//
//                // if at any time, 2 adjacent elements
//                // become equal, return false
//            else
//                System.out.println(true);
//            return true;
//        }
//        System.out.println(false);
//        return false;
//
//
//    }


    //MY OWN IMPLEMENTATION
    public boolean isUniqueMethod(String word){
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        System.out.println(wordArray);
        System.out.println(word.length());
        for(int i = 0; i<word.length() - 1; i++){
            if(wordArray[i] == wordArray[i+1]){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

}
