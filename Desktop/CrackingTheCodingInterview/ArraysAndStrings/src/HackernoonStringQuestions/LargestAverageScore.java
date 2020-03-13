package HackernoonStringQuestions;

import java.lang.reflect.Array;
import java.util.HashMap;

public class LargestAverageScore {

    public void largestScore(String[][] scores) {
        HashMap<String,Integer> score = new HashMap<>();
        for (int i = 0; i < scores.length - 1; i++) {
//            score.put(scores[i][i], 1);
            System.out.println(scores[i][i]);
        }
    }
}
