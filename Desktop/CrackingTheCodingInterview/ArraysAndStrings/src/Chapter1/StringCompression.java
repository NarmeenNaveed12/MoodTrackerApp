package Chapter1;

import java.awt.*;
import java.util.ArrayList;

public class StringCompression {

    public String stringCompression(String word) {
//        for (int i = 0; i < word.length() - 1; i++)
//        {
//            // Counting occurrences of s[i]
//            int count = 1;
//            while (word.charAt(i) == word.charAt(i + 1))
//            {
//                i++;
//                count++;
//
//                if(i + 1 == word.length())
//                    break;
//            }
//            System.out.print(word.charAt(i) + "" +
//                    count + " ");
//        }
//
//        System.out.println();
//
//        return null;
//    }
        int index = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            int count = 1;
            index = i;
            while (word.charAt(i) == word.charAt(i + 1)) {
                i++;
                count++;

                if(i+1 == word.length()){
                    break;
                }
            }
            System.out.println(word.charAt(i) + " " + count + " " + index);
        }

        return null;
    }
}
