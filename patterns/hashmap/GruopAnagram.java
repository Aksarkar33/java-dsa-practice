import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GruopAnagram {
    public static void main(String[] args) {

        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

        HashMap<String, List<String>> group = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (group.containsKey(key)) {
                group.get(key).add(word);
            } else {
                List<String> newGruop = new ArrayList<>();
                newGruop.add(word);
                group.put(key, newGruop);
            }

        }
        for (String key : group.keySet()) {
            System.out.println(group.get(key));
        }

    }
}
