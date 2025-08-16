import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            map.putIfAbsent(new String(wordArray), new ArrayList<>());
            map.get(new String(wordArray)).add(strs[i]);
        }
        for (List<String> item : map.values()) {
            result.add(item);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(GroupAnagram.groupAnagrams(new String[]{"eat", "tea"}));
    }
}



