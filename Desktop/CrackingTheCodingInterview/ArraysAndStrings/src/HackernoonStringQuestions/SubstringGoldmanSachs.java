package HackernoonStringQuestions;

public class SubstringGoldmanSachs {


    public void toSubstring(String word){

        for(int i = 0; i<word.length() - 1; i++){
            int count = 1;
            while(word.charAt(i) == word.charAt(i+1)){
                i++;
                count++;
                if(i+1 == word.length()){
                    break;
                }
            }
            System.out.println(word.charAt(i) + " " + count);
        }


    }
}
