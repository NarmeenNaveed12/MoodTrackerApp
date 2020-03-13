package Chapter2;


import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDups {

    public char removeDups(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) { counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); }
        for (Map.Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) { System.out.println(entry.getKey());
            return entry.getKey(); }
        } throw new RuntimeException("didn't find any non repeated Character");
    }

}
