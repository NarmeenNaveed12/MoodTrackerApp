package Chapter1;

public class URLLify {

    public void urllifyMethod(String st){

        st=st.trim();
        String[] words= st.split(" ");
        StringBuilder sb=new StringBuilder("");
//        System.out.println(words.length);
        for(int i=0; i<words.length-1; i++){
            sb=sb.append(words[i]+"20%");
//            System.out.println(words[i]);

        }
        System.out.println(words[words.length-1 ]);
        sb.append(words[words.length-1]);
        System.out.println(sb.toString());


    }


}
