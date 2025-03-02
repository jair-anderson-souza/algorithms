class Solution {
    public static int[] topKFrequent(int[] nums, int k) {

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
}