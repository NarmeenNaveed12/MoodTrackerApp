package GoldmanSacksPracticeHackernoon;

import java.util.HashMap;

//Coderpad: given an array scores [][] = {“jerry”,”65”},{“bob”,”91”}, {“jerry”,”23”}, {“Eric”,”83”}} Find the student with highest average score
public class HighestGrade {

    public void highestScore(String[][] scores){
        int highestScore = 0;
        System.out.println(scores[0][0]);
        String higestScoringStudent = scores[0][0];
        for(int i = 0; i<scores.length-1; i++){
            if(Integer.parseInt(scores[i][1]) > highestScore){
                highestScore = Integer.parseInt(scores[i][1]);
                higestScoringStudent = scores[i][0];
            }
        }
        System.out.println(higestScoringStudent + " " + highestScore);
    }

}
