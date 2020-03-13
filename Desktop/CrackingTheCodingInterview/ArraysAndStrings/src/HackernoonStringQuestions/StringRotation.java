package HackernoonStringQuestions;


public class StringRotation {

    public void stringRotation(String str, String rotation)
        {
            String str2 = str + str;

            if (str2.contains(rotation)) {
                System.out.println("true");
            }
            else{
            System.out.println("false");
            }
        }
}
