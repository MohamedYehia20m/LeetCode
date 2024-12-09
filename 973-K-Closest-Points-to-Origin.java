class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max-heap based on the distance from the origin
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        
        // Add all points to the heap
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();  // Remove the farthest point when the size exceeds k
            }
        }

        // Convert the heap to an array of points to return
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}