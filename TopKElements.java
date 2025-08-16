import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements {

     public static int[] topKFrequentOne(int[] nums, int k) {

         Map<Integer, Integer> frequency = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
         }

         List<Integer> orderedList = frequency.entrySet()
                 .stream()
                 .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                 .map(Map.Entry::getKey)
                 .toList();

         int[] result = new int[k];
         for (int i = 0; i < k; i++) {
             result[i] = orderedList.get(i);
         }

         return result;
     }

    public static int[] topKFrequentTwo(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) ->
                a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            queue.add(entry);
            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] result = new int[k];
        int i =  0 ;
        while(!queue.isEmpty()){
            result[i++] = queue.poll().getKey();
        }

        return result;
    }
}