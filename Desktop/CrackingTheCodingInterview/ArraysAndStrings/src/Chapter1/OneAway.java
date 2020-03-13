package Chapter1;

public class OneAway {

    public OneAway(){

    }

    public boolean oneAway(String word1, String word2){
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        int count = 0;

            if(word1.length() == word2.length()){
                for(int i = 0; i<word2.length(); i++){
                    if(charArray1[i] != charArray2[i]){
                        count++;
                    }
                }
                if(count > 1){
                    System.out.println(false);
                    return false;
                }
                System.out.println(true);
                return true;
            }

        if(word2.length() == word1.length() - 1){
            for(int i = 0; i<word2.length(); i++){
                if(charArray1[i] != charArray2[i]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(false);
                return false;
            }
            System.out.println(true);
            return true;
        }

        if(word2.length() == word1.length() + 1){
            for(int i = 0; i<word2.length(); i++){
                if(charArray1[i] != charArray2[i]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(false);
                return false;
            }
            System.out.println(true);
            return true;
        }



        System.out.println(false);
        return false;
    }
}
