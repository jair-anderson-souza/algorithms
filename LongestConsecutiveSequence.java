import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int longest = 0;
        for(int item: set){
            if(!set.contains(item-1)){
                int counter = 0;
                while(set.contains(item+counter)){
                    counter++;
                }
                if(counter > longest){
                    longest = counter;
                }
            }
        }
 
        return longest;

    }
    
}

}
