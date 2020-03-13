package GoldmanSacksPracticeHackernoon;

public class SubstringTotal {

    public void substringTotal(String input){
        int count = 1;
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();

        for(int i = 0; i<charArray.length - 1; i++){
            index = i;
            while(charArray[i] == charArray[i+1]){
                i++;
                count++;
                if(i+1 == charArray.length){
                    break;
                }
                System.out.println(i);
            }
            stringBuilder.append(charArray[i]+""+count);

        }

        System.out.println(stringBuilder);
    }
}
