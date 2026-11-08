class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) {
            freq[t - 'A']++;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(freq[i]);
            }
        }

        Queue<Integer[]> queue = new LinkedList<>();
        int time = 0;
        while (!queue.isEmpty() || !maxHeap.isEmpty()) {
            int val = 0;
            time++;
            if (!maxHeap.isEmpty()) {
                val = maxHeap.poll();
                if (val - 1 > 0) {
                    queue.add(new Integer[]{val - 1, time + n});
                }
            }
            while (!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.offer(queue.poll()[0]);
            }
        }
        
        return time;
    }
}
