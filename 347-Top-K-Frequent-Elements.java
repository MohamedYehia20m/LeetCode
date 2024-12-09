class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Use a min-heap to find the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()  // Min-heap based on frequency
        );
        
        // Add all elements to the heap, but keep the size of heap <= k
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the element with the smallest frequency
            }
        }
        
        // Step 3: Extract the elements from the heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = (minHeap.poll().getKey());
        }
        
        return result;
    }
}