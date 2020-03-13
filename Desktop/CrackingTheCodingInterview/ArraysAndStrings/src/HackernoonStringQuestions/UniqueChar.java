package HackernoonStringQuestions;

import java.util.HashSet;

public class UniqueChar {

    public void uniqueChar(String words) {
        HashSet hashSet = new HashSet();
        char[] words1 = words.toCharArray();
        for (char c : words1) {
            hashSet.add(c);
        }

        //NOW CHECK IF ITS EQUAL
    }
}
