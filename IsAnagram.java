import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public boolean isAnagramOne(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();

        for (char element : s.toCharArray()) {
            mapOne.put(element, mapOne.getOrDefault(element, 0) + 1);
        }

        for (char el : t.toCharArray()) {
            mapTwo.put(el, mapTwo.getOrDefault(el, 0) + 1);
        }

        for (Character element : mapOne.keySet()) {
            if (!mapOne.get(element).equals(mapTwo.get(element))) {
                return false;
            }
        }
        return true;
    }

     public boolean isAnagramTwo(String s, String t) {
         char[] firstWord = s.toCharArray();
         char[] secondWord = t.toCharArray();
         if(firstWord.length != secondWord.length){
             return false;
         }
         Arrays.parallelSort(firstWord);
         Arrays.parallelSort(secondWord);
         return Arrays.equals(firstWord, secondWord);
     }

}