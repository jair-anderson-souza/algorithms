class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();
        if(firstWord.length != secondWord.length){
            return false;
        }
        Arrays.parallelSort(firstWord);
        Arrays.parallelSort(secondWord);
        for(int i=0; i<firstWord.length; i++){
            if(firstWord[i] != secondWord[i]){
                return false;
            }
        }
        return true;

    }
}