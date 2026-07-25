// this solution solves it in O(n) time: putting in map is O(n), creating the frequency list of  
// arrays is also O(n), and result creation is also O(n). MOST OPTIMUM IN TERMS OF RUNTIME

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num: nums)
        {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : count.entrySet())
        {
            freq[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--)
        {
            for (int n: freq[i])
            {
                res[index++] = n;
                if (index == k)
                    return res;
            }
        }
        return res;
    }
}
