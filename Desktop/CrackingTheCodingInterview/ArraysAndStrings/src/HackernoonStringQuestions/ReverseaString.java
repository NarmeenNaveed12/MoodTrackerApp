package HackernoonStringQuestions;

import java.lang.reflect.Array;

public class ReverseaString {

    public void reverseString(String word){
        StringBuffer stringBuffer = new StringBuffer();
        char[] words = word.toCharArray();
        for(int i = 0; i<words.length; i++){
           stringBuffer.append(words[words.length-i-1]);
       }
        System.out.println(stringBuffer);

    }
}


//    public static String dnaComplement(String s) {
//        StringBuffer stringBuf = new StringBuffer(" ");
//        char[] stringToCharArray = s.toCharArray();
//        int wordLength = stringToCharArray.length;
//        for(int i = 0; i<wordLength; i++){
//            stringBuf.append(stringToCharArray[wordLength-i-1]);
//        }
//        String reversedString = stringBuf.toString();
//        for(int j = 0; j<reversedString.length(); j++){
//            if(reversedString.charAt(j) == 'A'){
//                reversedString = reversedString.replace('A', 'T');
//            }
//            if(reversedString.charAt(j) == 'T'){
//                reversedString = reversedString.replace('T', 'A');
//            }
//            if(reversedString.charAt(j) == 'C'){
//                reversedString = reversedString.replace('C', 'G');
//            }
//            if(reversedString.charAt(j) == 'G'){
//                reversedString = reversedString.replace('G', 'C');
//            }
//        }
//        return reversedString;
//
//
//    }

//}
